//Quiz 3-3 prob 8
package quiz0303;

import java.util.Scanner;

public class Prob8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lineA;
        String[] lineB;
        
        System.out.print("문자열 1: ");
        lineA = sc.nextLine().split("");
        System.out.print("문자열 2: ");
        lineB = sc.nextLine().split("");

        findSame : for(int i=0; i<lineA.length; i++) {
            for(int j=0; j<lineB.length; j++) {
                if(lineA[i].equals(lineB[j])) {
                    System.out.println("공통 문자: " + lineB[j]);
                    break findSame;
                }
            }
        }


        sc.close();        
    }
}
