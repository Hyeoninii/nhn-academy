//Quiz 3-4 prob 12
package quiz0304;

import java.util.Scanner;

public class Prob12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열1 입력: ");
        String str = sc.nextLine();
        System.out.print("문자열2 입력: ");
        String str2 = sc.nextLine();

        System.out.print("공통 문자: ");
        String commonChars = "";
        for(int i=0; i<str2.length(); i++){
            for(int j=0; j<str.length(); j++){
                if(str2.charAt(i)==str.charAt(j)){
                    char commonChar = str2.charAt(i);
                    if(commonChars.indexOf(commonChar) == -1){
                        commonChars += commonChar;
                        System.out.print(commonChar + " ");
                    }
                    break;
                }
            }
        }

        sc.close();
    }
} 