package quiz0205;

import java.util.Scanner;

//Quiz 2-5 prob 5
public class BooleanOperation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int m;
        System.out.print("첫 번째 정수를 입력하세요: ");
        n = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        m = sc.nextInt(); 
        System.out.printf("두 값이 모두 양수인가? %b%n", n>0&&m>0 );
        System.out.printf("두 값 중 하나라도 양수인가? %b%n", n>0||m>0);
        
        sc.close();
    }    
}
