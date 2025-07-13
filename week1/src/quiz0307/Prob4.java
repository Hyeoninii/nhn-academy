//Quiz 3-7 prob 4
package quiz0307;

import java.util.Scanner;

public class Prob4 {
    public static void main(String[] args) throws IllegalArgumentException{
        Scanner sc = new Scanner(System.in);
        
        System.out.print("나이를 입력하세요: ");
        String input = sc.nextLine();
        
        try {
            int age = Integer.parseInt(input);
            System.out.println("나이: " + age);
        }  catch (Exception e) {
            throw new IllegalArgumentException(e);
        } finally {
            sc.close();
        }
    }
} 