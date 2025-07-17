package com.nhnacademy;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GameApp extends Application {
    private boolean moveLeft = false;
    private boolean moveRight = false;
    private boolean gameFinished = false;
    private boolean gameStarted = false;
    private int score = 0;
    private int lives = 3;
    private List<Shape> bricks = new ArrayList<>();
    private Ball ball;
    private Paddle paddle;

    @Override
    public void start(Stage primaryStage) {
        // Canvas 생성
        Canvas canvas = new Canvas(800, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Ball 생성
        ball = new Ball(400, 300, 10, 3, 3, Color.RED);

        // Paddle 생성
        paddle = new Paddle(400, 550, 100, 20, 5, Color.BLUE);

        // 벽돌 생성
        createBricks();

        // 게임 루프
        AnimationTimer gameLoop = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (gameFinished) {
                    return;
                }

                // 화면 초기화
                gc.setFill(Color.BLACK);
                gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

                // 게임이 시작되지 않았으면 공을 패들 위에 위치
                if (!gameStarted) {
                    ball.setX(paddle.getX());
                    ball.setY(paddle.getY() - paddle.getHeight() / 2 - ball.getRadius());
                } else {
                    // Ball 업데이트 및 충돌 체크
                    ball.update();
                    checkBallCollisions(canvas.getWidth(), canvas.getHeight());
                }

                // Paddle 움직임 처리
                if (moveLeft) {
                    paddle.moveLeft();
                }
                if (moveRight) {
                    paddle.moveRight();
                }

                // Paddle 경계 확인
                paddle.checkBounds(canvas.getWidth());

                // 모든 객체 그리기
                drawGameObjects(gc);

                // UI 정보 표시
                drawUI(gc);

                // 게임 상태 확인
                checkGameState();
            }
        };
        gameLoop.start();

        // 레이아웃 설정
        StackPane root = new StackPane();
        root.getChildren().add(canvas);

        Scene scene = getScene(root);

        primaryStage.setTitle("Brick Breaker");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void createBricks() {
        int rows = 5;
        int cols = 10;
        double brickWidth = 70;
        double brickHeight = 20;
        double padding = 5;
        double startX = 50;
        double startY = 50;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                double x = startX + col * (brickWidth + padding);
                double y = startY + row * (brickHeight + padding);
                int random = (int) (Math.random() * 10);
                Brick brick = null;
                if(random > 5) {
                    brick = new RedBrick(x, y, brickWidth, brickHeight);
                } else {
                    brick = new NormalBrick(x, y, brickWidth, brickHeight);
                }
                bricks.add(brick);
            }
        }
    }

    private void checkBallCollisions(double canvasWidth, double canvasHeight) {
        // 화면 경계 충돌 체크
        ball.checkCollision(canvasWidth, canvasHeight);

        // 패들 충돌 체크
        if (paddle.checkCollision(ball)) {
            handlePaddleCollision();
        }

        // 벽돌 충돌 체크
        Iterator<Shape> iterator = bricks.iterator();
        while (iterator.hasNext()) {
            Brick brick = (Brick) iterator.next();
            if (brick.checkCollision(ball)) {
                iterator.remove();
                score += brick.getPoint();
                handleBrickCollision(brick);
            }
        }

        // 공이 화면 아래로 떨어졌는지 확인
        if (ball.getY() + ball.getRadius() >= canvasHeight) {
            loseLife();
        }
    }

    private void handlePaddleCollision() {
        // 공이 패들의 어느 부분에 맞았는지에 따라 방향 결정
        double ballX = ball.getX();
        double paddleX = paddle.getX();
        double paddleWidth = paddle.getWidth();
        
        // 패들 중심으로부터의 상대적 위치 계산
        double relativeIntersectX = (ballX - paddleX) / (paddleWidth / 2);
        
        // 각도 계산 (-60도 ~ 60도)
        double angle = relativeIntersectX * Math.PI / 3;
        
        // 속도 설정
        double speed = Math.sqrt(ball.getDx() * ball.getDx() + ball.getDy() * ball.getDy());
        ball.setDx(speed * Math.sin(angle));
        ball.setDy(-speed * Math.cos(angle));
    }

    private void handleBrickCollision(Brick brick) {
        // 충돌 위치에 따라 방향 결정
        double ballX = ball.getX();
        double ballY = ball.getY();
        double brickX = brick.getX();
        double brickY = brick.getY();
        double brickWidth = brick.getWidth();
        double brickHeight = brick.getHeight();
        int brickPoint = brick.getPoint();

        // 충돌한 면 계산
        double overlapLeft = ballX + ball.getRadius() - brickX;
        double overlapRight = brickX + brickWidth - (ballX - ball.getRadius());
        double overlapTop = ballY + ball.getRadius() - brickY;
        double overlapBottom = brickY + brickHeight - (ballY - ball.getRadius());

        double minOverlap = Math.min(Math.min(overlapLeft, overlapRight), 
                                   Math.min(overlapTop, overlapBottom));

        if (minOverlap == overlapLeft || minOverlap == overlapRight) {
            ball.bounceHorizontal();
        } else {
            ball.bounceVertical();
        }
    }

    private void loseLife() {
        lives--;
        if (lives <= 0) {
            gameOver();
        } else {
            resetBall();
        }
    }

    private void resetBall() {
        ball.setX(paddle.getX());
        ball.setY(paddle.getY() - paddle.getHeight() / 2 - ball.getRadius());
        ball.setDx(3);
        ball.setDy(-3);
        gameStarted = false;
    }

    private void checkGameState() {
        // 모든 벽돌이 파괴되었는지 확인
        if (bricks.isEmpty()) {
            gameWon();
        }
    }

    private void gameOver() {
        gameFinished = true;
        showGameOverPopup("패배", "게임 오버! 스코어: " + score);
    }

    private void gameWon() {
        gameFinished = true;
        showGameOverPopup("승리", "승리! 스코어: " + score);
    }

    private void drawGameObjects(GraphicsContext gc) {
        // 패들 그리기
        paddle.draw(gc);
        
        // 공 그리기
        ball.draw(gc);
        
        // 벽돌 그리기
        for (Shape brick : bricks) {
            brick.draw(gc);
        }
    }

    private void drawUI(GraphicsContext gc) {
        gc.setFill(Color.WHITE);
        gc.setFont(javafx.scene.text.Font.font("Arial", 16));
        gc.fillText("Score: " + score, 10, 20);
        gc.fillText("Life: " + lives, 10, 40);
        
        if (!gameStarted) {
            gc.fillText("스페이스바", 300, 300);
        }
    }

    private void drawPoint(GraphicsContext gc, Brick brick) {
        gc.setFill(Color.WHITE);
        gc.setFont(javafx.scene.text.Font.font("Arial", 16));
        gc.fillText("+" + brick.getPoint(), 10, 20);
    }

    private Scene getScene(StackPane root) {
        Scene scene = new Scene(root, 800, 600);

        scene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.LEFT) {
                moveLeft = true;
            } else if (event.getCode() == KeyCode.RIGHT) {
                moveRight = true;
            } else if (event.getCode() == KeyCode.SPACE && !gameStarted) {
                gameStarted = true;
            }
        });

        scene.setOnKeyReleased(event -> {
            if (event.getCode() == KeyCode.LEFT) {
                moveLeft = false;
            } else if (event.getCode() == KeyCode.RIGHT) {
                moveRight = false;
            }
        });
        return scene;
    }

    //게임이 끝나면 창 띄워줌
    private void showGameOverPopup(String title, String message) {
        Platform.runLater(() -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, message, ButtonType.OK);
            alert.setTitle(title);
            alert.setHeaderText(null);

            alert.showAndWait().ifPresent(response -> {
                if (response == ButtonType.OK) {
                    Platform.exit();
                }
            });
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}