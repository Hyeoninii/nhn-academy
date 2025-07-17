package com.nhnacademy;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Canon extends Shape implements Drawable {

    public Canon() {
        // 왼쪽 하단에 배치
        this.centerX = 50;
        this.centerY =550;
        this.minX = 30;
        this.minY =530;
        this.maxX = 70;
        this.maxY =570;
        this.color = Color.GRAY;
    }

    public void draw(GraphicsContext gc) {
        // 대포 기반 (사각형)
        gc.setFill(Color.DARKGRAY);
        gc.fillRect(minX, minY + 20, maxX - minX, 20);
        
        // 대포 돔 (동그라미)
        gc.setFill(Color.GRAY);
        gc.fillOval(centerX - 15, centerY - 15, 30, 30);
        
        // 포신 (길게 늘린 사각형)
        gc.setFill(Color.BLACK);
        gc.fillRect(centerX + 5, centerY - 3, 40, 6);
        
        // 포신 끝 부분 (약간 둥글게)
        gc.fillOval(centerX + 40, centerY - 4, 10, 10);

    }


}
