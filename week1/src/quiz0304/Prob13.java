//Quiz 3-4 prob 13
package quiz0304;

import java.util.Scanner;

public class Prob13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int n = sc.nextInt();
        System.out.print("팩토리얼: ");
        int factorial = 1;
        for(int i=1; i<=n; i++){
            factorial *= i;
        }
        System.out.println(factorial);
        sc.close();
    }
} 