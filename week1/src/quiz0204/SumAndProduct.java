package quiz0204;

import java.util.Scanner;

//Quiz 2-4 prob 4
public class SumAndProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수를 입력하세요 (공백으로 구분): ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.printf("합: %d %n곱: %d%n", n+m, n*m);
        sc.close();
    }
}
