//Quiz 3-4 prob 10
package quiz0304;

import java.util.Scanner;

public class Prob10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력: ");
        String str = sc.nextLine();
        System.out.print("문자 입력: ");
        char ch = sc.next().charAt(0);
        boolean found = false;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==ch){
                found = true;
            }
        }
        if(found){
            System.out.println("포함되어 있습니다.");
        }
        sc.close();
    }
} 