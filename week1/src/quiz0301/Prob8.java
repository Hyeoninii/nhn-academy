//Quiz 3-1 prob 8
package quiz0301;

import java.util.Scanner;

public class Prob8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int n = sc.nextInt();
        int a = 1;
        int b = 1;
        int i=0;
        while(i<n) {
            if(a > b) {
                System.out.print(b + " ");
                b += a;
            } else {
                System.out.print(a + " ");
                a += b;
            }
            i++;
        }
        System.out.println();

        sc.close();
    }
}