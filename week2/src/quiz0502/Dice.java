//Quiz 5-2 prob 4
package quiz0502;

public class Dice {
    int faceValue;
    public Dice() {
        roll();
    }
    public void roll() {
        this.faceValue = (int)(Math.random()*6);
    }
    public static void main(String[] args) {
        Dice dice = new Dice();
        System.out.println(dice.faceValue);
    }
}
