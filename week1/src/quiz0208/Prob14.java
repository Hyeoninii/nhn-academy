package quiz0208;

//Quiz 2-8 prob 14
import java.util.Scanner;

public class Prob14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("구매할 위젯 수: ");
        int count = sc.nextInt();

        System.out.print("위젯당 가격: ");
        double price = sc.nextDouble();

        double total = count * price;

        System.out.printf("총 비용: %.2f 원%n", total);
        sc.close();
    }
}
