package com.nhnacademy;

import javafx.scene.paint.Color;

public class Wall extends Rectangle {
    public Wall(int centerX, int centerY, int minX, int maxX, int minY, int maxY, Color color) {
        super(centerX, centerY, minX, maxX, minY, maxY, Color.BLACK);
    }
}
