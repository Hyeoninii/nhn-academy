//Quiz 3-6 prob 9
package quiz0306;

import java.util.Scanner;

public class Prob9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num = sc.nextInt();
        switch(num%2){
            case 0:
                System.out.println("짝수입니다.");
                break;
            case 1:
                System.out.println("홀수입니다.");
                break;
        }
        sc.close();
    }
} 