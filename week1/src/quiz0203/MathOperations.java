package quiz0203;

import java.lang.Math;

//Quiz 2-3 prob 1
public class MathOperations {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        int addResult = Math.addExact(a,b);
        int subtractResult = Math.subtractExact(a,b);
        int multiplyResult = Math.multiplyExact(a,b);
        int floorDivResult = Math.floorDiv(a,b);
        int floorModResult = Math.floorMod(a, b);

        System.out.println("합: " + addResult);
        System.out.println("차: " + subtractResult);
        System.out.println("곱: " + multiplyResult);
        System.out.println("몫: " + floorDivResult);
        System.out.println("나머지: " + floorModResult);
    }
}