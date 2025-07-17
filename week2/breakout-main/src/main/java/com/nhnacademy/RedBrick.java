package com.nhnacademy;

import javafx.scene.paint.Color;

public class RedBrick extends Brick{
    private static final Color red = Color.RED;
    public RedBrick(double x, double y, double width, double height) {
        super(x, y, width, height, red);
        super.setPoint(20);
    }
}
