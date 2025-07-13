//Quiz 5-4 prob 19
package quiz0504;

import java.util.Arrays;

public class Prob19 {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        
        Card[] hand = new Card[5];

        for (int i = 0; i < 5; i++) {
            hand[i] = deck.dealCard();
        }
        
        System.out.println("\n정렬 전:");
        printCards(hand);
        
        Arrays.sort(hand, (c1, c2) -> Integer.compare(c1.getValue(), c2.getValue()));
        
        System.out.println("값별 오름차순 정렬:");
        printCards(hand);
    }
    
    public static void printCards(Card[] cards) {
        for (int i = 0; i < cards.length; i++) {
            System.out.println("카드 " + (i + 1) + ": " + cards[i].toString());
        }
        System.out.println();
    }
} 