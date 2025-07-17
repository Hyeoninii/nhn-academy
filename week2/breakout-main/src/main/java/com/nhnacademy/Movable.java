package com.nhnacademy;

public interface Movable {
    double dx=0;
    double dy=0;
    double speed=0;
    void move();
    double getDx();
    double getDy();
    void setDx(double dx);
    void setDy(double dy);
    void pause();
    void resume();


}
