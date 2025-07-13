//quiz 4-2 prob 6
package quiz0402;

import java.util.Scanner;

public class Prob6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = addNumbers(a, b);
        System.out.println("합: " + result);
        sc.close();
    }
    static int addNumbers(int a, int b) {
        return a + b;
    }
}
