//Quiz 5-4 prob 5
package quiz0504;

public class Prob5 {
    public static void main(String[] args) {
        Hand hand = new Hand();
        hand.addCard(new Card(2, 5));
        hand.addCard(new Card(0, 10));
        hand.addCard(new Card(1, 3));
        hand.addCard(new Card(3, 7));
        
        System.out.println("정렬 전:");
        hand.printCards();
        
        hand.sortBySuit();
        System.out.println("무늬별 정렬:");
        hand.printCards();
        
        hand.sortByValue();
        System.out.println("값별 정렬:");
        hand.printCards();
    }
} 