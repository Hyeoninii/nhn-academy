//Quiz 4-3 prob 17
package quiz0403;

import java.util.Scanner;
import java.util.Arrays;

public class NthLargestFinder {
    public static int findNthLargest(int[] list, int n) {
        Arrays.sort(list);
        return list[n-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요: ");
        int[] arr = new int[sc.nextInt()];
        System.out.print("배열의 요소를 입력하세요: ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int n;
        while(true) {
            System.out.print("순번을 입력하세요: ");
            n = sc.nextInt();
            if(n==0) {break;}
            if(n>arr.length) {
                sc.close();
                throw new IllegalArgumentException("배열 크기보다 큰 값");
            }
            System.out.printf("%d번째 요소: %d%n",n, findNthLargest(arr, n));
        }
        sc.close();
    }
}
