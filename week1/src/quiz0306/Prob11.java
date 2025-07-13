//Quiz 3-6 prob 11
package quiz0306;

import java.util.Scanner;

public class Prob11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("복권 번호를 입력하세요(3자리): ");
        int num = sc.nextInt();
        switch(num){
            case 777:
                System.out.println("1등 당첨");
                break;
            case 555:
                System.out.println("2등 당첨");
                break;
            case 123:
                System.out.println("3둥 당첨");
                break;
            default:
                System.out.println("꽝");
                break;
        }
        sc.close();
    }
} 