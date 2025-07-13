//Quiz 5-4 prob 18
package quiz0504;

public class Prob18 {
    public static void main(String[] args) {
        Hand hand = new Hand();
        
        hand.addCard(new Card(0, 5));
        hand.addCard(new Card(1, 12));
        hand.addCard(new Card(2, 8));
        hand.addCard(new Card(3, 15));
        hand.addCard(new Card(0, 3));
        hand.addCard(new Card(1, 10));
        
        System.out.println("모든 카드:");
        hand.printCards();
        
        System.out.println("값이 10 이상인 카드:");
        hand.filterCardsByValue(10);
    }
} 