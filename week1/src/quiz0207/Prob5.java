package quiz0207;

import java.util.Scanner;

//Quiz 2-7 prob 5
public class Prob5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eggs;
        int dozen;
        int remaining;
        int gross;

        System.out.print("계란 수: ");
        eggs = sc.nextInt();

        gross = eggs / 144;
        dozen = (eggs % 144) / 12;
        remaining = (eggs % 144) % 12;
      
        System.out.println("당신의 계란 수는 " + gross + " gross, " + dozen + " dozen, " + remaining + "입니다.");

        sc.close();
    }
}
