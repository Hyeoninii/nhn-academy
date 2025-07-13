//Quiz 3-5 prob 4
package quiz0305;

import java.util.Scanner;

public class Prob4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int n = sc.nextInt();
        
        if(n%2==0){
            System.out.println("짝수입니다.");
        }else{
            System.out.println("홀수입니다.");
        }
        sc.close();
    }
} 