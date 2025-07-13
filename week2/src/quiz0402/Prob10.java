//quiz 4-2 prob 10
package quiz0402;

import java.util.Scanner;

public class Prob10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();
        try {
            validateAge(age);
            System.out.println("나이는 " + age + "세입니다.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
    public static void validateAge(int age) {
        if(age <0) {
            throw new IllegalArgumentException("나이가 잘못되었습니다.");
        }
    }
}
