//Quiz 3-4 prob 19
package quiz0304;

import java.util.Scanner;

public class Prob19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 항 (a): ");
        int a = sc.nextInt();
        System.out.print("공차 (d): ");
        int d = sc.nextInt();
        System.out.print("항의 갯수 (n): ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.print(a+i*d+" ");
        }
        sc.close();
    }
} 