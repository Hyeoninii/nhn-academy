//Quiz 3-6 prob 12
package quiz0306;

import java.util.Scanner;

public class Prob12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("월 번호를 입력하세요(1~12): ");
        int month = sc.nextInt();
        switch(month){
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("겨울");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }
        sc.close();
    }
} 