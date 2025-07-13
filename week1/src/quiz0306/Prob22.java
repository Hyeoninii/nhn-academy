//Quiz 3-6 prob 22
package quiz0306;

import java.util.Scanner;

public class Prob22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x와 y 좌표를 입력하세요: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x>0 && y>0){
            System.out.println("1사분면");
        }else if(x<0 && y>0){
            System.out.println("2사분면");
        }else if(x<0 && y<0){
            System.out.println("3사분면");
        }else if(x>0 && y<0){
            System.out.println("4사분면");
        }else{
            System.out.println("축 위에 있습니다");
        }
        sc.close();
    }
} 