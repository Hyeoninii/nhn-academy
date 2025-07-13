//Quiz 3-5 prob 15
package quiz0305;

import java.util.Scanner;

public class Prob15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("짝수입니다.");
        }else{
            System.out.println("홀수입니다.");
        }
        if(n>0 && n<=50) {
            System.out.println(n+"은/는 범위 안에 있습니다.");
        }else{
            System.out.println(n+"은/는 범위 안에 없습니다.");
        }
        sc.close();
    }
} 