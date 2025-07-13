//Quiz 5-4 prob 4
package quiz0504;

public class Prob4 {
    public static void main(String[] args) {
        Hand hand = new Hand();
        hand.addCard(new Card(0, 1));
        hand.addCard(new Card(1, 10));
        hand.addCard(new Card(2, 13));
        
        System.out.println("손패 카드들:");
        hand.printCards();
    }
} 