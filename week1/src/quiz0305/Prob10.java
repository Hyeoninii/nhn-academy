//Quiz 3-5 prob 10
package quiz0305;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Prob10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("두 정수를 입력하세요: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(b==0) {
                System.out.println("에러");
                sc.close();
                return;
            }
            
            if(a%b==0){
                System.out.println(a+"는 "+b+"의 배수입니다.");
            }else{
                System.out.println(a+"는 "+b+"의 배수가 아닙니다.");
            }
        } catch (InputMismatchException e) {
            System.out.println("에러");
        }
        
        sc.close();
    }
} 