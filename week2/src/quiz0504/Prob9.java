//Quiz 5-4 prob 9
package quiz0504;

public class Prob9 {
    public static void main(String[] args) {
        Hand hand = new Hand();
        
        Card card1 = new Card(0, 1);
        Card card2 = new Card(1, 10);
        Card card3 = new Card(2, 13);
        
        hand.addCard(card1);
        hand.addCard(card2);
        hand.addCard(card3);
        
        System.out.println("카드 추가:");
        hand.printCards();
        
        hand.removeCard(card2);
        System.out.println("카드 제거:");
        hand.printCards();
    }
} 