//Quiz 3-1 prob 7
package quiz0301;

import java.util.Scanner;

public class Prob7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num;

        while ((num = sc.nextInt()) != 0) {
            if(num == 0) {break;}
            if(((num % 2) == 0) && (num > 0)) {
                System.out.println(num);
            }
        }
        sc.close();
    }
}