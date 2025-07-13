//Quiz 3-1 prob 14
package quiz0301;

import java.util.Scanner;

public class Prob14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while(true) {
            System.out.print("1에서 100 사이의 숫자를 입력하세요: ");
            n = sc.nextInt();
            if(n <= 100 && n > 0) break;
        }

        System.out.println("유효한 입력: " + n);
        sc.close();
    }
}