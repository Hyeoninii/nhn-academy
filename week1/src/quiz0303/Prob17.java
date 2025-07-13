package quiz0303;

import java.util.Scanner;

public class Prob17 {
    public static void main(String[] args) {
        String input;
        String password = "test";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("비밀번호를 입력하세요: ");
            input = sc.nextLine();
        }while(!(input.equals(password)));
        System.out.println("로그인 성공!");
        sc.close();
    }
}
