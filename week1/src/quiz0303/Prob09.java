//Quiz 3-3 prob 9
package quiz0303;

import java.util.Scanner;
import java.lang.Math;

public class Prob09 {
    public static void main(String[] args) {
        System.out.println("1부터 100 사이의 숫자를 맞춰보세요!");
        Scanner sc = new Scanner(System.in);
        int n;
        int target = (int)(Math.random()*100);
        do {
            System.out.print("숫자 입력: ");
            n = sc.nextInt();

            if(n > target) { System.out.println("더 작은 숫자를 입력하세요.");}
            else if(n < target) { System.out.println("더 큰 숫자를 입력하세요.");}
            else {} 
        } while(n != target);

        sc.close();
    }
}
