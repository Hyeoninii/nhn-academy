package quiz0504;

import java.util.ArrayList;
import java.util.Comparator;

public class Hand {
    private ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public boolean removeCard(Card card) {
        return cards.remove(card);
    }

    public Card getCard(int position) {
        if (position >= 0 && position < cards.size()) {
            return cards.get(position);
        }
        return null;
    }

    public void clear() {
        cards.clear();
    }

    public int getCardCount() {
        return cards.size();
    }

    public void sortBySuit() {
        cards.sort(Comparator.comparingInt(Card::getSuit));
    }

    public void sortByValue() {
        cards.sort(Comparator.comparingInt(Card::getValue));
    }

    public int getTotalValue() {
        int total = 0;
        for (Card card : cards) {
            total += card.getValue();
        }
        return total;
    }

    public void filterCardsByValue(int minValue) {
        for (Card card : cards) {
            if (card.getValue() >= minValue) {
                System.out.println(card.toString());
            }
        }
    }

    public void printCards() {
        if (cards.isEmpty()) {
            System.out.println("손패가 비어있습니다.");
        } else {
            for (int i = 0; i < cards.size(); i++) {
                System.out.println("위치 " + i + ": " + cards.get(i).toString());
            }
        }
        System.out.println();
    }

    public ArrayList<Card> getCards() {
        return new ArrayList<>(cards);
    }
} 