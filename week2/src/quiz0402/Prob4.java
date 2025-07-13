//quiz 4-2 prob 4
package quiz0402;

public class Prob4 {
    static int gamePlayed;
    static double gameWon = 0;
    static int won;
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            gameWon = Math.random();
            playGame();
            showScore();
        }
    }
    static void playGame() {
        System.out.println("게임을 시작합니다.");
    }
    static void showScore() {
        gamePlayed++;
        if(gameWon>=0.5) {
                won++;
        }
        System.out.println("Played: " + gamePlayed + ", Won: " + won);
    }
}
