//Quiz 5-3 prob 13
package quiz0503;

import java.util.Arrays;
import java.util.Random;

public class Prob13 {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        for(int i=0; i<arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
    }
} 