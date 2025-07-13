//quiz 3-11 prob 14
package quiz0311;

import java.lang.Math;


public class quiz14 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for(int i=0; i<numbers.length; i++) {
            numbers[i] = (int)(Math.random()*100);
        }
        int count = 0;
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == 42) {
                count++;
            }
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("42가 등장한 횟수: " + count);
    }
}
