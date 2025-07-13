//Quiz 3-5 prob 12
package quiz0305;

import java.util.Scanner;

public class Prob12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        int score = sc.nextInt();
        System.out.print("등급: ");
        if(score>=0 && score<=100){
            if(score>=90){
                System.out.println("우수");
            }else if(score>=70 && score<90){
                System.out.println("보통");
            }else {
                System.out.println("미흡");
            }
        sc.close();
        }
    }
}