//Quiz 5-4 prob 8
package quiz0504;

public class Prob8 {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        
        Hand playerHand = new Hand();
        
        System.out.println("카드 5장 분배:");
        for (int i = 0; i < 5; i++) {
            Card card = deck.dealCard();
            playerHand.addCard(card);
            System.out.println("카드 " + (i + 1) + ": " + card.toString());
        }
    }
} 