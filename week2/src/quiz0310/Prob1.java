//Quiz 3-10 prob 1
package quiz0310;

public class Prob1 {
    public static void main(String[] args) {
        int dice1;
        int dice2;
        int count = 0;
        do {
            dice1 = (int)(Math.random() * 6) + 1;
            dice2 = (int)(Math.random() * 6) + 1;
            count++;
        } while(dice1 != 1 || dice2 != 1);

        System.out.println("던진 횟수: " + count);

    }
}
