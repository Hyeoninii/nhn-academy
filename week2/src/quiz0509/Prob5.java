//Quiz 5-9 prob 5
package quiz0509;

import textio.TextIO;
import quiz0504.Deck;

public class Prob5 {
    public static void main(String[] args) {
        double money = 100.0;
        Deck deck = new Deck();

        System.out.println("시작 금액: $100");
        
        while (money > 0) {
            System.out.println("현재 금액: $" + money);
            System.out.print("베팅 금액을 입력하세요 (0 = 종료): $");
            double bet = TextIO.getlnDouble();
            
            if (bet == 0) {
                System.out.println("게임 종료, 최종 금액: $" + money);
                break;
            }
            
            if (bet > money) {
                System.out.println("보유 금액보다 많습니다.");
                continue;
            }
            
            if (bet < 0) {
                System.out.println("음수");
                continue;
            }

            boolean userWon = playBlackjackGame(deck);
            
            if (userWon) {
                money += bet;
                System.out.println("승리! +$" + bet);
            } else {
                money -= bet;
                System.out.println("패배! -$" + bet);
            }

            if (deck.cardsLeft() < 10) {
                deck.shuffle();
                System.out.println("덱 셔플");
            }
        }
        
        if (money <= 0) {
            System.out.println("파산");
        }
    }
    
    private static boolean playBlackjackGame(Deck deck) {
        BlackjackHand userHand = new BlackjackHand();
        BlackjackHand dealerHand = new BlackjackHand();

        userHand.addCard(deck.dealCard());
        dealerHand.addCard(deck.dealCard());
        userHand.addCard(deck.dealCard());
        dealerHand.addCard(deck.dealCard());

        System.out.println("딜러 카드: " + dealerHand.getCard(0) + " [숨겨진 카드]");
        System.out.println("유저 카드: " + userHand.getCard(0) + ", " + userHand.getCard(1));
        System.out.println("핸드 값: " + userHand.getBlackjackValue());

        if (dealerHand.getBlackjackValue() == 21) {
            System.out.println("딜러 블랙잭");
            return false;
        }
        
        if (userHand.getBlackjackValue() == 21) {
            System.out.println("블랙잭");
            return true;
        }

        while (true) {
            System.out.print("\nHit(1) 또는 Stand(2)? ");
            int choice = TextIO.getlnInt();
            
            if (choice == 1) {
                userHand.addCard(deck.dealCard());
                System.out.println("새 카드: " + userHand.getCard(userHand.getCardCount() - 1));
                System.out.println("유저의 핸드 값: " + userHand.getBlackjackValue());
                
                if (userHand.getBlackjackValue() > 21) {
                    return false;
                }
            } else if (choice == 2) {
                break;
            } else {
                System.out.println("1 또는 2를 입력하세요.");
            }
        }
        
        // 딜러 턴
        System.out.println("\n딜러의 모든 카드: ");
        for (int i = 0; i < dealerHand.getCardCount(); i++) {
            System.out.println("  " + dealerHand.getCard(i));
        }
        System.out.println("딜러의 핸드 값: " + dealerHand.getBlackjackValue());
        
        while (dealerHand.getBlackjackValue() <= 16) {
            dealerHand.addCard(deck.dealCard());
            System.out.println("딜러가 카드를 뽑았습니다: " + dealerHand.getCard(dealerHand.getCardCount() - 1));
            System.out.println("딜러 핸드 값: " + dealerHand.getBlackjackValue());
        }
        
        if (dealerHand.getBlackjackValue() > 21) {
            return true;
        }
        
        // 승자 결정
        int userValue = userHand.getBlackjackValue();
        int dealerValue = dealerHand.getBlackjackValue();
        
        System.out.println("\n최종 결과:");
        System.out.println("유저: " + userValue);
        System.out.println("딜러: " + dealerValue);
        
        if (userValue > dealerValue) {
            System.out.println("승리");
            return true;
        } else {
            System.out.println("패배");
            return false;
        }
    }
}