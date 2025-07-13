//Quiz 3-5 prob 9
package quiz0305;

import java.util.Scanner;

public class Prob9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int n = sc.nextInt();
        if(n>0){
            System.out.println("양수입니다.\n절댓값: "+n);
        }else if(n<0){
            System.out.println("음수입니다.\n절댓값: "+(-n));
        }else{
            System.out.println("0입니다.\n절댓값: 0");
        }
        sc.close();
    }
} 