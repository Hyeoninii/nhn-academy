package com.nhnacademy;

public interface Breakable {
    /**
     * 해당 객체가 파괴되었는지 확인합니다.
     */
    boolean isDestroyed();
    /**
     * 해당 객체를 파괴합니다.
     */
    void breakObj();
}
