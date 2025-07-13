//quiz 4-2 prob 8
package quiz0402;

import java.util.Scanner;

public class Prob8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수의 갯수를 입력하세요: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i=0; i<n; i++) {
            System.out.print("정수를 입력하세요: ");
            numbers[i] = sc.nextInt();
        }
        int result = sumArray(numbers);
        System.out.println("합: " + result);
        sc.close();
    }

    public static int sumArray(int[] numbers) {
        int sum = 0;
        for(int i=0; i<numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
