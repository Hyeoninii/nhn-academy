package quiz0206.Calculator.src;

import java.util.Scanner;

//Quiz 2-6 prob 5
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(a+b);
    }
}
