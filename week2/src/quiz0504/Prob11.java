//Quiz 5-4 prob 11
package quiz0504;

public class Prob11 {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        for (int i = 0; i < 5; i++) {
            Card card = deck.dealCard();
            if (card != null) {
                System.out.println("카드 " + (i + 1) + ": " + card.toString());
            }
        }
        
        System.out.println("남은 카드 수: " + deck.cardsRemaining());
    }
} 