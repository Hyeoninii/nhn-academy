//Quiz 3-5 prob 16
package quiz0305;

import java.util.Scanner;

public class Prob16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int n = sc.nextInt();
        
        if(n >= 1000 && n <= 9999) {
            System.out.println("네자리수입니다.");
        } else {
            System.out.println("네자리수가 아닙니다.");
        }
        
        sc.close();
    }
} 