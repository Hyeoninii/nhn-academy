//Quiz 3-6 prob 8
package quiz0306;

import java.util.Scanner;

public class Prob8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("물건 종류(1~3)와 개수를 입력하세요: ");
        int type = sc.nextInt();
        int count = sc.nextInt();
        switch(type){
            case 1:
                System.out.println("총 가격: " + count*500);
                break;
            case 2:
                System.out.println("총 가격: " + count*1000);
                break;
            case 3:
                System.out.println("총 가격: " + count*2000);
                break;
            default:
                System.out.println("유효하지 않은 입력입니다.");
                break;
        }
        sc.close();
    }
} 