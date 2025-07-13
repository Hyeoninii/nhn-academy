//Quiz 3-5 prob 14
package quiz0305;

import java.util.Scanner;

public class Prob14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("작은 값: "+Math.min(a, b));
        sc.close();
    }
} 