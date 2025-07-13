//Quiz 3-4 prob 15
package quiz0304;

import java.util.Scanner;

public class Prob15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("단 입력: ");
        int n = sc.nextInt();

        for(int i=1; i<=9; i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
        sc.close();
    }
} 