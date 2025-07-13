package quiz0203;

import java.util.Scanner;

//Quiz 2-3 prob 7
public class EnumExample {
    enum Season { SPRING, SUMMER, FALL, WINTER }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("계절을 입력하세요 (SPRING, SUMMER, FALL, WINTER): ");
        
        try {
            Season season = Season.valueOf(sc.nextLine());
            System.out.println("입력한 계절은: " + season);
        } catch (IllegalArgumentException e) {
            System.out.println("잘못된 계절입니다.");
        }

        sc.close();
    }
}
