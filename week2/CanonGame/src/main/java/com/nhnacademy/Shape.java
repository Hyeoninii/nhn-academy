package com.nhnacademy;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Shape implements Drawable {
    int centerX;
    int centerY;
    int minX;
    int minY;
    int maxX;
    int maxY;
    Color color;

    public Shape() {}

    public Shape(int centerX, int centerY, int minX, int minY, int maxX, int maxY, Color color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.minX = minX;
        this.minY = minY;
        this.maxX = maxX;
        this.maxY = maxY;
        this.color = color;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setStroke(Color.BLACK);
        gc.strokeRect(minX, minY, maxX - minX, maxY - minY);
        gc.setFill(color);
        gc.fillRect(minX, minY, maxX - minX, maxY - minY);
        gc.fillOval(centerX - 5, centerY - 5, 10, 10);
    }

}
