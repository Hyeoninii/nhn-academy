//Quiz 3-5 prob 20
package quiz0305;

import java.util.Scanner;

public class Prob20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();
        if(age>=19) {
            System.out.println("성인입니다.");
        }else{
            System.out.println("미성년자입니다.");
        }
        sc.close();
    }
} 