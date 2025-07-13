//Quiz 3-5 prob 8
package quiz0305;

import java.util.Scanner;

public class Prob8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 문자를 입력하세요: ");
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        if(a>b){
            System.out.println(b+" "+a);
        }else{
            System.out.println(a+" "+b);
        }
        sc.close();
    }
} 