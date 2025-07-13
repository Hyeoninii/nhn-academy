//Quiz 3-7 prob 2
package quiz0307;

import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        String input = sc.nextLine(); 
        try {
            int age = Integer.parseInt(input);
            if(age<0){
                sc.close();
                throw new IllegalArgumentException("음수");
            }
            System.out.println("나이: " + age);
        } catch (NumberFormatException e) {
            System.out.println("숫자가 아닙니다! 유효한 나이를 입력하세요.");
        } catch (IllegalArgumentException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
        sc.close();
    }
}
