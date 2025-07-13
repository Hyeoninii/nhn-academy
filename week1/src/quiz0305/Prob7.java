//Quiz 3-5 prob 7
package quiz0305;

import java.util.Scanner;

public class Prob7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세 숫자를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a <= b && b <= c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a <= c && c <= b) {
            System.out.println(a + " " + c + " " + b);
        } else if (b <= a && a <= c) {
            System.out.println(b + " " + a + " " + c);
        } else if (b <= c && c <= a) {
            System.out.println(b + " " + c + " " + a);
        } else if (c <= a && a <= b) {
            System.out.println(c + " " + a + " " + b);
        } else {
            System.out.println(c + " " + b + " " + a);
        }
        
        sc.close();
    }
} 