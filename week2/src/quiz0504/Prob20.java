//Quiz 5-4 prob 20
package quiz0504;

public class Prob20 {
    public static void main(String[] args) {
        Card card = new Card(1, 10);
        
        System.out.println("카드 무늬: " + card.getSuit());
        System.out.println("카드 값: " + card.getValue());
        
        // 불변성 확인 - setter가 없으므로 수정 불가
        System.out.println("카드 정보: " + card.toString());
    }
} 