//Quiz 5-4 prob 14
package quiz0504;

public class Prob14 {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        
        Hand playerHand = new Hand();

        for (int i = 0; i < 5; i++) {
            Card card = deck.dealCard();
            if (card != null) {
                playerHand.addCard(card);
                System.out.println("카드 " + (i + 1) + " 추가: " + card.toString());
            }
        }
    }
} 