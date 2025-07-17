package com.nhnacademy;

import javafx.scene.paint.Color;

public class Rectangle extends Shape {
    public Rectangle() {
        super();
    }
    public Rectangle(int centerX, int centerY, int minX, int minY, int maxX, int maxY, Color color) {
        super(centerX, centerY, minX, minY, maxX, maxY, color);
    }
}
