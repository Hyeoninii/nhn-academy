//Quiz 3-5 prob 19
package quiz0305;

import java.util.Scanner;

public class Prob19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("합: "+(a+b));
        if((a+b)>=100) {
            System.out.println("100 이상입니다.");
        }
        sc.close();
    }
} 