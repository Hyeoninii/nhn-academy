//Quiz 3-3 prob 5
package quiz0303;

import java.util.Scanner;

public class Prob5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        String answer;

        do {
            System.out.print("숫자 입력: ");
            n = sc.nextInt();
            sc.nextLine();
            sum += n;
            System.out.print("다시 입력하시겠습니까? ");
            answer = sc.nextLine();
        } while(answer.equals("yes"));

        System.out.println("합: "+sum);
        sc.close();
    }
}
