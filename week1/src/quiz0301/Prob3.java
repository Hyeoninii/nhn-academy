//Quiz 3-1 prob 3
package quiz0301;

import java.util.Scanner;

public class Prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;

        while(count <= n) {
            sum += count;
            count++;
        }

        System.out.println("합: "+ sum);
        sc.close();
    }
}