//Quiz 3-6 prob 7
package quiz0306;

import java.util.Scanner;

public class Prob7 {
    enum AccountState {ACTIVE, INACTIVE, CLOSED}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("계좌 상태를 입력하세요(ACTIVE, INACTIVE, CLOSED): ");
        String state = sc.nextLine();
        AccountState accountState = AccountState.valueOf(state);
        switch(accountState){
            case ACTIVE:
                System.out.println("정상적으로 운영 중입니다.");
                break;
            case INACTIVE:
                System.out.println("비활성 상태입니다.");
                break;
            case CLOSED:
                System.out.println("계좌가 닫혔습니다.");
                break;
            default:
                System.out.println("알 수 없는 상태입니다.");
                break;
        }
        sc.close();
    }
} 