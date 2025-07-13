//Quiz 3-5 prob 1
package quiz0305;

import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("큰 값: " + Math.max(a, b));
        sc.close();
    }
} 