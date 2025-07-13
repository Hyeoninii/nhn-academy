package quiz0504;

import java.util.Random;

public class Deck {
    private Card[] cards;
    private int cardsUsed;

    public Deck() {
        cards = new Card[52];
        int index = 0;
        
        for (int suit = 0; suit < 4; suit++) {
            for (int value = 1; value <= 13; value++) {
                cards[index++] = new Card(suit, value);
            }
        }
        cardsUsed = 0;
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = cards.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
        cardsUsed = 0;
    }

    public Card dealCard() {
        if (cardsUsed >= cards.length) {
            return null;
        }
        return cards[cardsUsed++];
    }

    public int cardsRemaining() {
        return cards.length - cardsUsed;
    }

    public void printAllCards() {
        for (int i = 0; i < cards.length; i++) {
            System.out.println("카드 " + (i + 1) + ": " + cards[i].toString());
        }
    }

    public void printFirstFiveCards() {
        for (int i = 0; i < 5; i++) {
            System.out.println("카드 " + (i + 1) + ": " + cards[i].toString());
        }
        System.out.println();
    }

    public Card[] getCards() {
        return cards.clone();
    }
} 