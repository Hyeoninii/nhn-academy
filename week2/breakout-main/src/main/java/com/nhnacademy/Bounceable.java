package com.nhnacademy;

public interface Bounceable {
    /**
     * 위 아래에서 충돌이 발생했을 때, 세로 방향 이동 값을 변경합니다.
     */
    void bounceVertical();
    /**
     * 좌,우에서 충돌이 발생했을 때, 가로 방향 이동 값을 변경합니다.
     */
    void bounceHorizontal();
    /**
     * 모서리에서 충돌했을 때, 가로/세로 방향 이동 값을 변경합니다.
     */
    void bounceBoth();
}
