//quiz 3-11 prob 9
package quiz0311;

import java.lang.Math;

public class Prob9 {
    public static void main(String[] args) {
        int n, m;
        do {
            n = (int)(Math.random() * 10) + 1;
            m = (int)(Math.random() * 10) + 1;
        } while(n == m);

        System.out.println(n + " " + m);
    }
}
