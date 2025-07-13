//Quiz 3-3 prob 7
package quiz0303;

import java.util.Scanner;

public class Prob7 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 (0을 입력하면 종료): ");
        int n;

        while((n=sc.nextInt()) != 0) {
            if((n % 2) == 0) {sb.append(n).append(" ");}
        }

        System.out.println("짝수: "+ sb.toString());
        
        sc.close();
    }    
}
