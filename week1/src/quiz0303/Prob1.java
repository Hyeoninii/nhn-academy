//Quiz 3-3 prob 1
package quiz0303;

import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        int count = 0;
        System.out.print("양의 정수를 입력하세요 (0을 입력하면 종료): ");
        
        while((n = sc.nextInt()) != 0) {
            sum += n;
            count++;
        }
        System.out.printf("평균: %.1f%n", sum/(double)count);

        sc.close();
    }
}