package quiz0207;

import java.util.Scanner;

//Quiz 2-7 prob 7
public class Prob7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new File("testdata.txt"));
        String name = sc.nextLine();
        int scoreA = Integer.parseInt(sc.nextLine());
        int scoreB = Integer.parseInt(sc.nextLine());
        int scoreC = Integer.parseInt(sc.nextLine());

        System.out.println("이름: " + name);
        System.out.println("평균: " + (scoreA + scoreB + scoreC) / 3);
    }
}
