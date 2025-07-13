//Quiz 3-1 prob 4
package quiz0301;

import java.util.Scanner;

public class Prob4 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");

        //assignment -> expression
        while((num = sc.nextInt()) != 0) {
            if(num == 0) {break;}
            if(num > 0) {
                sum += num;
            }
        }
        System.out.println("합: " + sum);
        sc.close();
    }
}