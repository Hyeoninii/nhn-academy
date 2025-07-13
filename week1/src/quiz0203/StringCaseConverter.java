package quiz0203;

import java.util.Scanner;

//Quiz 2-3 prob 4
public class StringCaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String line = sc.nextLine();

        String upperCase = line.toUpperCase();
        String lowerCase = line.toLowerCase();

        System.out.println("대문자: " + upperCase);
        System.out.println("소문자: " + lowerCase);

        sc.close();
    }
}
