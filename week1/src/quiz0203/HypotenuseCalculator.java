package quiz0203;

import java.lang.Math;
import java.util.Scanner;

//Quiz 2-3 prob 2
public class HypotenuseCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 변의 길이를 입력하세요: ");
        // 첫 번째 변의 길이(a) 받기
        int a = scanner.nextInt();
        System.out.print("두 번째 변의 길이를 입력하세요: ");
        // 두 번째 변의 길이(b) 받기
        int b = scanner.nextInt();

        // TODO: 빗변 길이 계산하기
        double hypotenuse = Math.sqrt((Math.pow(a, 2)+Math.pow(b, 2)));
        System.out.println("빗변의 길이: " + hypotenuse);

        scanner.close();
    }
}
