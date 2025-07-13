//Quiz 5-4 prob 16
package quiz0504;

public class Prob16 {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        
        for (int i = 0; i < 10; i++) {
            Card card = deck.dealCard();
            if (card != null && card.getValue() % 2 == 0) {
                System.out.println("카드 " + (i + 1) + " (짝수): " + card.toString());
            }
        }
    }
} 