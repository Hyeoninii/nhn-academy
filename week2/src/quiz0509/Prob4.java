//Quiz 5-9 prob 4 (Exercise 5.4)
package quiz0509;

import java.util.Random;
import textio.TextIO;
import quiz0504.Deck;
import quiz0504.Card;

public class Prob4 {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Random random = new Random();
        
        while (true) {
            int numCards = random.nextInt(5) + 2;
            
            BlackjackHand hand = new BlackjackHand();

            for (int i = 0; i < numCards; i++) {
                if (deck.cardsLeft() > 0) {
                    hand.addCard(deck.dealCard());
                }
            }

            for (int i = 0; i < hand.getCardCount(); i++) {
                Card card = hand.getCard(i);
                System.out.println(card);
            }

            System.out.println("핸드 값: " + hand.getBlackjackValue());
            System.out.println();

            System.out.print("continue? (y/n): ");
            String response = TextIO.getlnString().toLowerCase();
            if (!response.equals("y")) {
                break;
            }

            if (deck.cardsLeft() < 6) {
                deck.shuffle();
                System.out.println("덱 셔플");
            }
        }
    }
}

