//Quiz 5-3 prob 10
package quiz0503;

import java.util.Date;
import java.util.Random;

public class Prob10 {

    public static void main(String[] args) {
        Random rand = new Random();
        Date date = new Date();
        StringBuilder sb = new StringBuilder().append(rand.nextInt(100))
                .append(" ")
                .append(date);

        System.out.println(sb.toString());
    }
} 