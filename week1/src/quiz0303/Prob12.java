//Quiz 3-3 prob 12
package quiz0303;

import java.util.Scanner;

public class Prob12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("1에서 10 사이의 숫자를 입력하세요: ");
            n = sc.nextInt();
        } while((n > 10) || (n < 1));

        System.out.println("유효한 입력: " + n);
        sc.close();
    }
}
