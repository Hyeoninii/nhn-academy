package quiz0205;

import java.util.Scanner;

//Quiz 2-5 prob 4
public class BooleanOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int m;
        System.out.print("첫 번째 정수를 입력하세요: ");
        n = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        m = sc.nextInt(); 
        System.out.printf("첫 번째 값이 두 번째 값보다 큰가? %b%n", n>m);
        System.out.printf("첫 번째 값이 두 번째 값보다 작은가? %b%n", n<m);
        System.out.printf("두 값이 같은가? %b%n", n==m);
        
        sc.close();
    }    
}
