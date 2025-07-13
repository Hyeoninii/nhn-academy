package quiz0203;

import java.util.Scanner;

//Quiz 2-3 prob 3
public class StringLengthCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        // 문자열 입력 받기
        String line = scanner.nextLine();

        System.out.println(line.length());

        scanner.close();
    }
}
