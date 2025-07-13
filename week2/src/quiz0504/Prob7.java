//Quiz 5-4 prob 7
package quiz0504;

public class Prob7 {
    public static void main(String[] args) {
        Deck deck = new Deck();
        
        System.out.println("셔플 전:");
        deck.printFirstFiveCards();
        
        deck.shuffle();
        
        System.out.println("셔플 후:");
        deck.printFirstFiveCards();
    }
} 