//Quiz 3-3 prob 10
package quiz0303;

import java.util.Scanner;

public class Prob10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;
        while(true) {
            System.out.print("입력: ");
            line=sc.nextLine();
            if(line.equals("exit")) {
                System.out.println("프로그램 종료");
                break;
            }
            else {
                System.out.println("입력한 값: "+line);
            }
        }
            
         sc.close();
    }
}
