//Quiz 3-3 prob 2
package quiz0303;

import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n; 
        System.out.print("숫자를 입력하세요 (0을 입력하면 종료): ");

        while((n = sc.nextInt()) != 0) {
            if(min>n) {min = n;}
            if(max<n) {max = n;}
        }
        System.out.printf("최소값: %d%n최대값: %d%n", min, max);
        sc.close();
    }
}