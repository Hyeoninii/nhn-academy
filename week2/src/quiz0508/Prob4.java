//Quiz 5-8 prob 4
package quiz0508;

public class Prob4 {
    public static void main(String[] args) {
        Game4 game = new Game4();
        Game4.Player4 player = game.new Player4("Alice");
        player.setPlayerScore(50);
        player.displayScore(); // "Alice: 50 (Game Score: 100)" 출력
    }
}

class Game4 {
    private int gameScore = 100;

    class Player4 {
        private String name;
        private int playerScore;

        public Player4(String name) {
            this.name = name;
        }
        public void setPlayerScore(int playerScore) {
            this.playerScore = playerScore;
        }
        public int getPlayerScore() {
            return playerScore;
        }
        public void displayScore() {
            System.out.println(this.name + ": " + this.playerScore + " (Game Score: 100)");
        }

    }
}