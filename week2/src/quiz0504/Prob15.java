//Quiz 5-4 prob 15
package quiz0504;

public class Prob15 {
    public static void main(String[] args) {
        Hand player1 = new Hand();
        Hand player2 = new Hand();
        
        // 플레이어1에게 카드 추가
        player1.addCard(new Card(0, 10));
        player1.addCard(new Card(1, 8));
        player1.addCard(new Card(2, 5));
        player1.addCard(new Card(3, 12));
        player1.addCard(new Card(0, 3));
        
        // 플레이어2에게 카드 추가
        player2.addCard(new Card(1, 9));
        player2.addCard(new Card(2, 7));
        player2.addCard(new Card(3, 11));
        player2.addCard(new Card(0, 6));
        player2.addCard(new Card(1, 4));
        
        int sum1 = player1.getTotalValue();
        int sum2 = player2.getTotalValue();
        
        System.out.println("플레이어1의 카드: " + sum1);
        System.out.println("플레이어2의 카드: " + sum2);
        
        if (sum1 > sum2) {
            System.out.println("플레이어1 승리");
        } else if (sum2 > sum1) {
            System.out.println("플레이어2 승리");
        } else {
            System.out.println("무승부입니다!");
        }
    }
} 