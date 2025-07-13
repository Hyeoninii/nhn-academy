package quiz0205;

import java.util.Scanner;

//Quiz 2-5 prob 8
public class StringToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;
        
        System.out.print("문자열로 숫자를 입력하세요: ");
        line = sc.nextLine();
        System.out.println("정수 값: " + Integer.parseInt(line));
        System.out.println("실수 값: " + Double.parseDouble(line));

        sc.close();
    }
}
