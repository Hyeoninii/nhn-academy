//Quiz 3-6 prob 10
package quiz0306;

import java.util.Scanner;

public class Prob10 {
    enum State {LOGGED_IN, LOGGED_OUT, BLOCKED}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("상태를 입력하세요(LOGGED_IN, LOGGED_OUT, BLOCKED): ");
        String state = sc.nextLine();
        State stateEnum = State.valueOf(state);
        switch(stateEnum){
            case LOGGED_IN:
                System.out.println("사용자가 로그인했습니다.");
                break;
            case LOGGED_OUT:
                System.out.println("사용자가 로그아웃했습니다.");
                break;
            case BLOCKED:
                System.out.println("사용자가 차단되었습니다.");
                break;
        }
        sc.close();
    }
} 