//Quiz 5-4 prob 17
package quiz0504;

import java.util.HashSet;

public class Prob17 {
    public static void main(String[] args) {
        Deck deck = new Deck();
        
        HashSet<String> cardSet = new HashSet<>();
        boolean hasDuplicate = false;
        
        Card[] cards = deck.getCards();
        for (int i = 0; i < cards.length; i++) {
            Card card = cards[i];
            String cardString = card.getSuit() + "-" + card.getValue();
            
            if (cardSet.contains(cardString)) {
                System.out.println("중복: " + card.toString());
                hasDuplicate = true;
            } else {
                cardSet.add(cardString);
            }
        }
        
        if (!hasDuplicate) {
            System.out.println("고유: " + cardSet.size() + "장");
        } else {
            System.out.println("중복");
        }
    }
} 