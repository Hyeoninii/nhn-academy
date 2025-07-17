package com.nhnacademy;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Brick extends Rectangle implements Breakable {
    private boolean destroyed = false;
    
    public Brick() {
        super();
        // 바닥에 배치 (예시 좌표)
        this.centerX = 200;
        this.centerY = 580;
        this.minX = 180;
        this.minY = 570;
        this.maxX = 220;
        this.maxY = 590;
        this.color = Color.RED;
    }
    
    public Brick(int x, int y) {
        super();
        this.centerX = x;
        this.centerY = y;
        this.minX = x - 20;
        this.minY = y - 10;
        this.maxX = x + 20;
        this.maxY = y + 10;
        this.color = Color.RED;
    }
    
    @Override
    public void draw(GraphicsContext gc) {
        if (!destroyed) {
            // 벽돌을 사각형으로 그리기
            gc.setFill(color);
            gc.fillRect(minX, minY, maxX - minX, maxY - minY);
            // 테두리 추가
            gc.setStroke(Color.DARKRED);
            gc.setLineWidth(2);
            gc.strokeRect(minX, minY, maxX - minX, maxY - minY);
        }
    }
    
    @Override
    public boolean isDestroyed() {
        return destroyed;
    }

    @Override
    public void breakObj() {
        destroyed = true;
    }
}
