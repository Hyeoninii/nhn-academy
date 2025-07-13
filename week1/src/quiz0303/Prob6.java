//Quiz 3-3 prob 6
package quiz0303;

import java.util.Scanner;

public class Prob6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 (음수를 입력하면 종료): ");
        int n;
        int sum = 0;

        while((n=sc.nextInt())>0) {
            sum += n;
        }
        System.out.println("합: " + sum);
        sc.close();
    }    
}
