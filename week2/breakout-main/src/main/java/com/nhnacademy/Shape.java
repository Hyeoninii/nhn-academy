package com.nhnacademy;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Shape implements Drawable {
    int centerX;    //중심x
    int centerY;    //중심y
    int minX;       //왼쪽 -> 오른쪽
    int maxX;
    int minY;       //위 -> 아래
    int maxY;
    Color color;

    //생성자
    public Shape() {}

    public Shape(int centerX, int centerY, int minX, int maxX, int minY, int maxY, Color color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.minX = minX;
        this.maxX = maxX;
        this.minY = minY;
        this.maxY = maxY;
        this.color = color;
    }

    //Getter-Setter
    int getCenterX() {
        return centerX;
    }

    int getCenterY() {
        return centerY;
    }

    int getMinX() {
        return minX;
    }

    int getMaxX() {
        return maxX;
    }

    int getMinY() {
        return minY;
    }

    int getMaxY() { return maxY; }


    @Override
    public void draw(GraphicsContext gc) {
        gc.setStroke(Color.BLACK);  //선 색상 결정
        gc.strokeRect(minX, minY, maxX - minX, maxY - minY); // 기본 사각형

        gc.setFill(Color.RED); //색상
        //센터 위치가 왼쪽 상단이기 때문에 중심을 잡으려면 v2/2, v3/2만큼 이동해야 함
        gc.fillOval(centerX - 2, centerY - 2, 4, 4); // 중심점 표시용
    }
}
