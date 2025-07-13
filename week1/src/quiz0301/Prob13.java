//Quiz 3-1 prob 13
package quiz0301;

import java.util.Scanner;

public class Prob13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("두 정수를 입력하세요(공백으로 구분): ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("최대공약수: %d%n", gcd(a, b));
        sc.close();
    }
    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}
