//Quiz 3-5 prob 11
package quiz0305;

import java.util.Scanner;

public class Prob11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int n = sc.nextInt();
        if(n>0 && n<=100) {
            System.out.println(n+"은 범위 안에 있습니다.");
        }
        sc.close();
    }
} 