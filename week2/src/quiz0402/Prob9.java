//quiz 4-2 prob 9
package quiz0402;

import java.util.Scanner;

public class Prob9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println("Factorial(" + n + "): " + result);
        sc.close();
    }
    public static int factorial(int n) {
        if(n==0) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
