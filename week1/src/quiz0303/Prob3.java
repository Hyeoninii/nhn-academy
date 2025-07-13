//Quiz 3-3 prob 3
package quiz0303;

import java.util.Scanner;

public class Prob3 {
    public static int rad = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력: ");
        int n = sc.nextInt();
        System.out.printf("뒤집힌 숫자: %d%n", reverse(n));

        sc.close();
    }
    public static int reverse(int n) {
        if(n==0) return 0;
        int result = reverse(n/10) + (n%10) * rad;
        rad *= 10;
        return result;
    }
    
}
