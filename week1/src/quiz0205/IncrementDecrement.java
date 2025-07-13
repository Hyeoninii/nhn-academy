package quiz0205;

import java.util.Scanner;

//Quiz 2-5 prob 3
public class IncrementDecrement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("정수를 입력하세요: ");
        num = scanner.nextInt();

        System.out.println("입력값: " + num);
        System.out.println("증가 연산 후: " + (++num));
        System.out.println("감소 연산 후: " + (--num));

        scanner.close();
    }

}
