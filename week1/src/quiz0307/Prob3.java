//Quiz 3-7 prob 3
package quiz0307;

import java.util.Scanner;

public class Prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("인덱스를 입력하세요: ");
            String input = sc.nextLine();

            int index = Integer.parseInt(input);

            int[] numbers = { 1, 2, 3 };
            System.out.println(numbers[index]);
        } catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없는 문자열입니다.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 인덱스가 잘못되었습니다.");
        } finally {
            sc.close();
        }
    }
} 