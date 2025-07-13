package quiz0204;

import java.util.Scanner;

//Quiz 2-4 prob 2
public class AmountFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("금액을 입력하세요: ");
        double amount = sc.nextDouble();

        System.out.printf("입력된 금액은: $%.2f%n", amount);
        
        sc.close();
    }
}
