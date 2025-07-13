//Quiz 5-4 prob 10
package quiz0504;

public class Prob10 {
    public static void main(String[] args) {
        Card card1 = new Card(Card.SPADES, Card.ACE);
        Card card2 = new Card(Card.HEARTS, Card.KING);
        Card card3 = new Card(Card.DIAMONDS, Card.QUEEN);
        Card card4 = new Card(Card.CLUBS, Card.JACK);
        
        System.out.println("카드1: " + getSuitName(card1.getSuit()) + " " + getValueName(card1.getValue()));
        System.out.println("카드2: " + getSuitName(card2.getSuit()) + " " + getValueName(card2.getValue()));
        System.out.println("카드3: " + getSuitName(card3.getSuit()) + " " + getValueName(card3.getValue()));
        System.out.println("카드4: " + getSuitName(card4.getSuit()) + " " + getValueName(card4.getValue()));
    }
    
    public static String getSuitName(int suit) {
        switch (suit) {
            case Card.SPADES: return "스페이드";
            case Card.HEARTS: return "하트";
            case Card.DIAMONDS: return "다이아몬드";
            case Card.CLUBS: return "클럽";
            default: return "알 수 없음";
        }
    }
    
    public static String getValueName(int value) {
        switch (value) {
            case Card.ACE: return "에이스";
            case Card.JACK: return "잭";
            case Card.QUEEN: return "퀸";
            case Card.KING: return "킹";
            default: return String.valueOf(value);
        }
    }
} 