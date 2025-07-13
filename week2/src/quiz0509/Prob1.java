//Quiz 5-9 prob 1
package quiz0509;

public class Prob1 {
    public static void main(String[] args) {
        PairOfDice dice = new PairOfDice();
        System.out.println(dice.toString());
    }
}

class PairOfDice {
    private int die1;
    private int die2;
    int rollCount;

    public PairOfDice(int die1, int die2) {
        this.die1 = die1;
        this.die2 = die2;
    }
    public PairOfDice() {
        this(0,0);
    }

    void roll() {
        this.die1 = (int)(Math.random()*6+1);
        this.die2 = (int)(Math.random()*6+1);
        System.out.println("주사위1: "+this.die1 + ", 주사위2: "+this.die2);
    }

    int[] getValue() {
        return new int[] {die1, die2};
    }

    int calc2_2() {
        rollCount = 0;
        do {
            roll();
            rollCount++;
        } while (getValue()[0] != 2 || getValue()[1] != 2);
        return rollCount;
    }

    @Override
    public String toString() {
        return "던진 횟수 = " + rollCount;
    }

}
