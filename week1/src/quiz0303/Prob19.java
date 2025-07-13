//Quiz 3-3 prob 19
package quiz0303;

import java.util.Scanner;

public class Prob19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int value = scanner.nextInt();
            if(value == 0) break;
            if(value % 2 == 0) {
                System.out.println(value);
                continue;
            }
        }

        scanner.close();
    }

}
