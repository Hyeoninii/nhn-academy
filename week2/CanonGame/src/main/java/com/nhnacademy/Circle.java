package com.nhnacademy;

import javafx.scene.paint.Color;

public class Circle extends Shape {
    public Circle() {
        super();
    }
    public Circle(int centerX, int centerY, int minX, int minY, int maxX, int maxY, Color color) {
        super(centerX, centerY, minX, minY, maxX, maxY, color);
    }
}
