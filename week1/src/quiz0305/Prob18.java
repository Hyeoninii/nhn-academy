//Quiz 3-5 prob 18
package quiz0305;

import java.util.Scanner;

public class Prob18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "1234";
        System.out.print("패스워드를 입력하세요: ");
        String input = sc.nextLine();
        if(input.equals(password)) {
            System.out.println("패스워드가 맞습니다.");
        }else{
            System.out.println("패스워드가 맞지 않습니다.");
        }
        sc.close();
    }
} 