//Quiz 3-5 prob 13
package quiz0305;

import java.util.Scanner;

public class Prob13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int n = sc.nextInt();
        if(n%3==0 || n%5==0) {
            System.out.println(n+"은/는 3 또는 5의 배수입니다.");
        }else{
            System.out.println(n+"은/는 3 또는 5의 배수가 아닙니다.");
        }
        sc.close();
    }
} 