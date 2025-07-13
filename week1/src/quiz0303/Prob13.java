//Quiz 3-3 prob 13
package quiz0303;

import java.util.Scanner;

public class Prob13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력: ");
        int n = sc.nextInt();
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    System.out.println("소수가 아닙니다.");
                    break;
                }
            }
        }
        if(isPrime) { System.out.println("소수입니다.");}


        sc.close();
    }
}
