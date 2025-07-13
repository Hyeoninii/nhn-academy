//Quiz 3-4 prob 18
package quiz0304;

import java.util.Scanner;

public class Prob18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력: ");
        char[] str = sc.nextLine().trim().toCharArray();
        
        System.out.print("뒤집힌 문자열: ");
        for(int i=str.length-1; i>=0; i--){
            System.out.print(str[i]);
        }

        sc.close();
    }
} 