package quiz0204;

import java.util.Scanner;

//Quiz 2-4 prob 1
public class FormattedOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int n = sc.nextInt();
        System.out.printf("%10d%%%n", n);

        sc.close();
    }
}
