package quiz0509;

import quiz0504.Card;
import quiz0504.Hand;

class BlackjackHand extends Hand {
    public int getBlackjackValue() {
        int val = 0;
        boolean ace = false;
        int cards = getCardCount();

        for (int i=0; i<cards; i++) {
            Card card = getCard(i);
            int cardVal = card.getValue();
            if (cardVal > 10) {
                cardVal = 10;
            }
            if (cardVal == 1) {
                ace = true;
            }
            val = val + cardVal;
        }

        if (ace && val + 10 <= 21)
            val = val + 10;

        return val;
    }
}
