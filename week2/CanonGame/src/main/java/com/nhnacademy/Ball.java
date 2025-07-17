package com.nhnacademy;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Ball extends Circle implements Movable {
    private double x;
    private double y;
    private double speed;
    private double angle;
    private double radius;
    private double dx;
    private double dy;

    public Ball() {
        super();
        this.radius = 8;
    }
    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
        this.radius = 8;
    }
    public Ball(double x, double y, double speed, double angle, double radius, double dx, double dy) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.angle = angle;
        this.radius = radius;
        this.dx = dx;
        this.dy = dy;
    }

    @Override
    public void draw(GraphicsContext gc) {
        // 대포알을 원으로 그리기
        gc.setFill(Color.BLACK);
        gc.fillOval(x - radius, y - radius, radius * 2, radius * 2);
        
        // 테두리 추가
        gc.setStroke(Color.DARKGRAY);
        gc.setLineWidth(1);
        gc.strokeOval(x - radius, y - radius, radius * 2, radius * 2);
    }

    @Override
    public void move() {
        x += dx;
        y += dy;
    }

    public void boom() {
        Ball newBall = new Ball(x, y);
    }

    private double tempDx;
    private double tempDy;

    public double getDx() {
        return dx;
    }

    public void setDx(double dx) {
        this.dx = dx;
    }

    public double getDy() {
        return dy;
    }

    public void setDy(double dy) {
        this.dy = dy;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDX(double dx) {
        return dx;
    }

    public void setDX(double dx) {
        this.dx = dx;
    }

    public double getDY(double dy) {
        return dy;
    }

    public void setDY(double dy) {
        this.dy = dy;
    }
}

