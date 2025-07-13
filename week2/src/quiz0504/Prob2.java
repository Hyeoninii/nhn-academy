//Quiz 5-4 prob 2
package quiz0504;

public class Prob2 {
    public static void main(String[] args) {
        Card card1 = new Card(Card.SPADES, Card.ACE);
        Card card2 = new Card(Card.HEARTS, Card.KING);
        
        System.out.println("카드1 무늬: " + card1.getSuit() + ", 값: " + card1.getValue());
        System.out.println("카드2 무늬: " + card2.getSuit() + ", 값: " + card2.getValue());
    }
} 