package com.nhnacademy;

import javafx.scene.paint.Color;

public class Rectangle extends Shape {
    public Rectangle(int centerX, int centerY, int minX, int maxX, int minY, int maxY, Color color) {
        super(centerX, centerY, minX, maxX, minY, maxY, color);
    }

    public Rectangle() {
        super();
    }
}