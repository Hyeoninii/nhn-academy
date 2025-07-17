package com.nhnacademy;

import javafx.scene.paint.Color;

public class Wall extends Rectangle{
    public Wall() {}
    
    // GameApp에서 사용하는 생성자 (x, y, width, height)
    public Wall(int x, int y, int width, int height) {
        super(x + width/2, y + height/2, x, y, x + width, y + height, Color.GRAY);
    }
    
    // GameApp에서 사용하는 생성자 (x, y, width) - 높이는 기본값 사용
    public Wall(int x, int y, int width) {
        super(x + width/2, y + 5, x, y, x + width, y +10, Color.GRAY);
    }
    
    public Wall(int centerX, int centerY, int minX, int minY, int maxX, int maxY, Color color) {
        super(centerX, centerY, minX, minY, maxX, maxY, color);
    }
}
