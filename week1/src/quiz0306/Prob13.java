//Quiz 3-6 prob 13
package quiz0306;

import java.util.Scanner;

public class Prob13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수와 연산자를 입력하세요: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String op = sc.next();
        switch(op){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                if(b==0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    break;
                }
                System.out.printf("%.2f", a/b);
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                break;
        }
        sc.close();
    }
} 