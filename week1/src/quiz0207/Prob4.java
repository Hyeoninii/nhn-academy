package quiz0207;

import java.util.Scanner;

//Quiz 2-7 prob 4
public class Prob4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("쿼터(quarters)의 개수: ");
        int quarters = scanner.nextInt();
        
        System.out.print("다임(dimes)의 개수: ");
        int dimes = scanner.nextInt();
        
        System.out.print("니켈(nickels)의 개수: ");
        int nickels = scanner.nextInt();
        
        System.out.print("페니(pennies)의 개수: ");
        int pennies = scanner.nextInt();
        
        double dollars = (quarters * 0.25) + (dimes * 0.1) + (nickels * 0.05) + (pennies * 0.01);


        System.out.println("총 금액: $" + dollars);
        
        scanner.close();
    }
} 