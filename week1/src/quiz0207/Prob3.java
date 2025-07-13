package quiz0207;

import java.util.Scanner;

//Quiz 2-7 prob 3
public class Prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("이름: ");
        name = sc.nextLine();

        System.out.println("Hello, "+name.toUpperCase()+", nice to meet you!");

        sc.close();
    }
}