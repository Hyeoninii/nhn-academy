package quiz0205;

import java.util.Scanner;

//Quiz 2-5 prob 2
public class DivisionResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int m;

        try {
        System.out.print("첫 번째 정수를 입력하세요: ");
        n = scanner.nextInt();

        System.out.print("두 번째 정수를 입력하세요: ");
        m = scanner.nextInt();

        System.out.println("정수 나눗셈 결과: " + n/m);
        System.out.println("실수 나눗셈 결과: " + n/(double)m);

        }catch(ArithmeticException e) {
            System.out.println("연산에 오류가 발생하였습니다: / by zero");
        }
        
        scanner.close();
    }
}
