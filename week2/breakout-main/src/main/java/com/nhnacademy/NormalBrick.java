package com.nhnacademy;

import javafx.scene.paint.Color;

public class NormalBrick extends Brick {
    private static final Color normal = Color.BLUE;
    public NormalBrick(double x, double y, double width, double height) {
        super(x, y, width, height, normal);
        super.setPoint(10);
    }
}
