//Quiz 3-3 prob 4
package quiz0303;

import java.util.Scanner;

public class Prob4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0; 
        System.out.print("숫자를 입력하세요 (0을 입력하면 종료): ");

        while((n = sc.nextInt()) != 0) {
            sum += n;
        }
        System.out.printf("합: %d%n", sum);
        sc.close();
    }
}
