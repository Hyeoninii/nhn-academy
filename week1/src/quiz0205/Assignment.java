package quiz0205;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        System.out.print("첫 번째 정수를 입력하세요: ");
        a = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        b = sc.nextInt();

        System.out.println("원래 a 값:" + a);
        System.out.println("a += b: " + (a+b));
        System.out.println("a -= b: " + (a-b));
        System.out.println("a *= b: " + (a*b));
        System.out.println("a /= b: " + (a/b));

        sc.close();
    }
}
