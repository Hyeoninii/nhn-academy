//Quiz 5-4 prob 12
package quiz0504;

public class Prob12 {
    public static void main(String[] args) {
        Hand hand = new Hand();
        
        hand.addCard(new Card(0, 1));
        hand.addCard(new Card(1, 10));
        hand.addCard(new Card(2, 13));
        
        System.out.println("카드 추가:");
        hand.printCards();
        System.out.println("카드 개수: " + hand.getCardCount());
        
        hand.clear();
        System.out.println("clear()");
        hand.printCards();
        System.out.println("카드 개수: " + hand.getCardCount());
    }
} 