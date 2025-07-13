//Quiz 3-5 prob 2
package quiz0305;

import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args) {
        System.out.print("세 정수를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("가장 큰 값: " + Math.max(a, Math.max(b, c)));
        sc.close();
    }
} 