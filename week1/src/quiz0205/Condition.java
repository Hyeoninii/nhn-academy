package quiz0205;

import java.io.*;
import java.util.Scanner;

//Quiz 2-5 prob 6
public class Condition {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n;  

        System.out.print("정수를 입력하세요: ");
        n = sc.nextInt();
        if(n%2==0) {
            System.out.println("입력한 숫자는 짝수입니다.");
        } else {
            System.out.println("입력한 숫자는 홀수입니다.");
        }

        sc.close();
    }
}
