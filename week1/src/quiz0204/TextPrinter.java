package quiz0204;

import java.util.Scanner;

//Quiz 2-4 prob 3
public class TextPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String input = sc.nextLine();

        for(int i=0; i<input.length(); i++) {
            System.out.println(input.charAt(i));
        }
        sc.close();
    }
}
