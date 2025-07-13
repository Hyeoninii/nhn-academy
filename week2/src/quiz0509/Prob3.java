//Quiz 5-9 prob 3
package quiz0509;

public class Prob3 {
    public static void main(String[] args) {
        StatCalc stcalc = new StatCalc();

        for(int i=0; i<10000; i++) {
            PairOfDice dice = new PairOfDice();
            stcalc.enter(dice.calc2_2());
        }
        System.out.println(stcalc.toString());
    }
}
