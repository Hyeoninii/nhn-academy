//Quiz 3-1 prob 11
package quiz0301;

import java.util.Scanner;

public class Prob11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while(true) {
            System.out.print("정수를 입력하세요: ");
            n = sc.nextInt();
            if(n <= 0) {
                System.out.println("루프 종료");
                break;
            } else {
                System.out.printf("%d의 제곱: %d%n", n, n*n);
            }
        }

        sc.close();
    }
}