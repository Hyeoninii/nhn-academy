package com.nhnacademy;

import javafx.application.Platform;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.animation.AnimationTimer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameApp extends Application {
    private Canvas gameCanvas;
    private GraphicsContext gc;
    private AnimationTimer gameLoop;
    
    // 게임 상태
    private boolean gameRunning = false;
    private List<Shape> gameObjects = new ArrayList<>();
    private List<Ball> activeBalls = new ArrayList<>();
    private Canon canon;
    private List<Brick> bricks = new ArrayList<>();
    private List<Shape> targets = new ArrayList<>();
    private List<Wall> walls = new ArrayList<>();
    
    // 물리 상수
    private double gravity = 9.8;
    private double wind = 0.0;
    private double timeStep = 0.016; // 60FPS
    
    // UI 컨트롤
    private Slider speedSlider;
    private Slider angleSlider;
    private Slider gravitySlider;
    private Slider windSlider;
    private Button fireButton;
    private Button clearButton;
    
    // 게임 설정
    private double currentSpeed = 500;
    private double currentAngle = 45;
    private double currentGravity = 5;
    private double currentWind = 0;
    
    @Override
    public void start(Stage primaryStage) {
        // UI 구성
        VBox root = new VBox(10);
        root.setStyle("-fx-background-color: #f0f00; -fx-padding: 10;");
        
        // 게임 캔버스
        gameCanvas = new Canvas(800, 600);
        gc = gameCanvas.getGraphicsContext2D();
        
        // 컨트롤 패널
        VBox controlPanel = createControlPanel();
        
        // 레이아웃
        HBox mainLayout = new HBox(10);
        mainLayout.getChildren().addAll(controlPanel, gameCanvas);
        
        root.getChildren().add(mainLayout);
        
        // 씬 설정
        Scene scene = new Scene(root);
        primaryStage.setTitle("대포 게임");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        
        // 게임 초기화
        initializeGame();
        
        // 게임 루프 시작
        startGameLoop();
        
        // 이벤트 핸들러
        setupEventHandlers();
        
        primaryStage.show();
    }
    
    private VBox createControlPanel() {
        VBox panel = new VBox(10);
        panel.setStyle("-fx-background-color: #e0e00; -fx-padding: 10; -fx-min-width:200;");
        
        // 속도 슬라이더
        Label speedLabel = new Label("속도 (Speed)");
        speedSlider = new Slider(0, 1000, 500);
        speedSlider.setShowTickLabels(true);
        speedSlider.setShowTickMarks(true);
        speedSlider.valueProperty().addListener((obs, oldVal, newVal) -> {
            currentSpeed = newVal.doubleValue();
        });
        
        // 각도 슬라이더
        Label angleLabel = new Label("각도 (Angle)");
        angleSlider = new Slider(0, 80, 45);
        angleSlider.setShowTickLabels(true);
        angleSlider.setShowTickMarks(true);
        angleSlider.valueProperty().addListener((obs, oldVal, newVal) -> {
            currentAngle = newVal.doubleValue();
        });
        
        // 중력 슬라이더
        Label gravityLabel = new Label("중력 (Gravity)");
        gravitySlider = new Slider(0, 10, 5);
        gravitySlider.setShowTickLabels(true);
        gravitySlider.setShowTickMarks(true);
        gravitySlider.valueProperty().addListener((obs, oldVal, newVal) -> {
            currentGravity = newVal.doubleValue();
            gravity = currentGravity;
        });
        
        // 바람 슬라이더
        Label windLabel = new Label("바람 (Wind)");
        windSlider = new Slider(-10, 10, 0);
        windSlider.setShowTickLabels(true);
        windSlider.setShowTickMarks(true);
        windSlider.valueProperty().addListener((obs, oldVal, newVal) -> {
            currentWind = newVal.doubleValue();
            wind = currentWind;
        });
        
        // 버튼들
        fireButton = new Button("Fire!");
        fireButton.setStyle("-fx-background-color: #ff4444; -fx-text-fill: white; -fx-font-weight: bold;");
        fireButton.setMaxWidth(Double.MAX_VALUE);
        
        clearButton = new Button("Clear!");
        clearButton.setStyle("-fx-background-color: #4444ff; -fx-text-fill: white; -fx-font-weight: bold;");
        clearButton.setMaxWidth(Double.MAX_VALUE);
        
        panel.getChildren().addAll(
            speedLabel, speedSlider,
            angleLabel, angleSlider,
            gravityLabel, gravitySlider,
            windLabel, windSlider,
            fireButton, clearButton
        );
        
        return panel;
    }
    
    private void initializeGame() {
        // 대포 생성
        canon = new Canon();
        gameObjects.add(canon);
        
        // 벽 생성 (게임 영역 경계)
        createWalls();
        
        // 장애물 생성
        createObstacles();
        
        // 목표물 생성
        createTargets();
    }
    
    private void createWalls() {
        // 상단 벽
        walls.add(new Wall(0, 0, 800, 10));
        // 좌측 벽
        walls.add(new Wall  (0, 0, 10));
        // 우측 벽
        walls.add(new Wall(790, 0, 10));
        // 하단 벽 (지면)
        walls.add(new Wall(0, 590, 800));
        
        gameObjects.addAll(walls);
    }
    
    private void createObstacles() {
        // 중앙에 장애물 블록들 생성
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int x = 300 + random.nextInt(200);
            int y = 400 + random.nextInt(100);
            Brick brick = new Brick(x, y);
            bricks.add(brick);
            gameObjects.add(brick);
        }
    }
    
    private void createTargets() {
        // 오른쪽 하단에 목표물 생성
        Shape target = new Shape();
        target.centerX = 700;
        target.centerY = 550;
        target.minX = 690;
        target.minY = 540;
        target.maxX = 710;
        target.maxY = 560;
        target.color = Color.YELLOW;
        
        targets.add(target);
        gameObjects.add(target);
    }
    
    private void startGameLoop() {
        gameLoop = new AnimationTimer() {
            @Override
            public void handle(long now) {
                updateGame();
                renderGame();
            }
        };
        gameLoop.start();
    }
    
    private void updateGame() {
        // 활성 포탄들 업데이트
        for (int i = activeBalls.size() - 1; i >= 0; i--) {
            Ball ball = activeBalls.get(i);
            
            // 물리 업데이트
            ball.setDy(ball.getDy() + gravity * timeStep);
            ball.setDx(ball.getDx() + wind * timeStep);
            
            // 이동
            ball.move();
            
            // 충돌 검사
            checkCollisions(ball);
            
            // 화면 밖으로 나간 포탄 제거
            if (ball.getY() > 600 || ball.getX() < 0 || ball.getX() > 800) {
                activeBalls.remove(i);
            }
        }
    }
    
    private void checkCollisions(Ball ball) {
        // 벽과의 충돌
        for (Wall wall : walls) {
            if (isColliding(ball, wall)) {
                handleWallCollision(ball, wall);
            }
        }
        
        // 장애물과의 충돌
        for (int i = bricks.size() - 1; i >= 0; i--) {
            Brick brick = bricks.get(i);
            if (!brick.isDestroyed() && isColliding(ball, brick)) {
                brick.breakObj();
                activeBalls.remove(ball);
                break;
            }
        }
        
        // 목표물과의 충돌
        for (int i = targets.size() - 1; i >= 0; i--) {
            Shape target = targets.get(i);
            if (isColliding(ball, target)) {
                targets.remove(i);
                gameObjects.remove(target);
                activeBalls.remove(ball);
                showGameOverPopup("승리", "목표물을 맞췄습니다!");
                break;
            }
        }
    }
    
    private boolean isColliding(Ball ball, Shape shape) {
        double ballLeft = ball.getX() - ball.getRadius();
        double ballRight = ball.getX() + ball.getRadius();
        double ballTop = ball.getY() - ball.getRadius();
        double ballBottom = ball.getY() + ball.getRadius();
        
        return ballRight >= shape.minX && ballLeft <= shape.maxX &&
               ballBottom >= shape.minY && ballTop <= shape.maxY;
    }
    
    private void handleWallCollision(Ball ball, Wall wall) {
        if (wall.minX == 0 || wall.minX == 790) { // 좌우 벽
            ball.setDx(-ball.getDx() * 0.8); // 반사 계수 적용
        } else { // 상하 벽
            ball.setDy(-ball.getDy() * 0.8); // 반사 계수 적용
        }
    }
    
    private void renderGame() {
        // 배경 지우기
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, 800, 600);
        
        // 지면 그리기
        gc.setFill(Color.LIGHTGRAY);
        gc.fillRect(0, 590, 800, 10);
        
        // 모든 게임 객체 그리기
        for (Shape obj : gameObjects) {
            if (obj instanceof Drawable) {
                ((Drawable) obj).draw(gc);
            }
        }
        
        // 활성 포탄들 그리기
        for (Ball ball : activeBalls) {
            ball.draw(gc);
        }
    }
    
    private void setupEventHandlers() {
        fireButton.setOnAction(e -> fireCannon());
        clearButton.setOnAction(e -> clearBalls());
    }
    
    private void fireCannon() {
        // 포탄 발사
        double angleRad = Math.toRadians(currentAngle);
        double dx = currentSpeed * Math.cos(angleRad) / 1000;
        double dy = -currentSpeed * Math.sin(angleRad) / 100.0;
        
        Ball newBall = new Ball(canon.centerX + 45, canon.centerY - 5, currentSpeed, currentAngle, 8, dx, dy);
        activeBalls.add(newBall);
    }
    
    private void clearBalls() {
        activeBalls.clear();
    }
    
    private void showGameOverPopup(String title, String message) {
        Platform.runLater(() -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, message, ButtonType.OK);
            alert.setTitle(title);
            alert.setHeaderText(null);
            
            alert.showAndWait().ifPresent(response -> {
                if (response == ButtonType.OK) {
                    // 게임 재시작
                    activeBalls.clear();
                    targets.clear();
                    gameObjects.removeAll(targets);
                    createTargets();
                }
            });
        });
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
