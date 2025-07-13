//Quiz 5-4 prob 13
package quiz0504;

public class Prob13 {
    public static void main(String[] args) {
        Hand hand = new Hand();
        
        hand.addCard(new Card(0, 1));
        hand.addCard(new Card(1, 10));
        hand.addCard(new Card(2, 13));
        hand.addCard(new Card(3, 7));
        
        System.out.println("손패 카드:");
        hand.printCards();
        
        Card card1 = hand.getCard(0);
        Card card2 = hand.getCard(2);
        
        System.out.println("0번째 카드: " + card1.toString());
        System.out.println("2번째 카드: " + card2.toString());
    }
} 