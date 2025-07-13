//Quiz 3-4 prob 14
package quiz0304;

import java.util.Scanner;

public class Prob14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("소수입니다.");
        } else {
            System.out.println("소수가 아닙니다.");
        }
        sc.close();
    }
} 