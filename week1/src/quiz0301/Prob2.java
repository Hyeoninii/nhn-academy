//Quiz 3-1 prob 2
package quiz0301;

import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("정수를 입력하세요: ");
        n  = sc.nextInt();
        if(n<10) {
            System.out.println("작은 수");
        }
        sc.close();
    }
}