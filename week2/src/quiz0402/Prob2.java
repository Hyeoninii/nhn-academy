//quiz 4-2 prob 2
package quiz0402;

public class Prob2 {
        static int gamePlayed;
        static double gameWon = 0;
        static int won;
    public static void main(String[] args) {

        for(int i=0; i<10; i++) {
                gameWon = Math.random();
                playGame();
        }
    }
    static void playGame() {
        gamePlayed++;
        if(gameWon>=0.5) {
                won++;
        }
        System.out.println("게임을 시작합니다.");
        System.out.println("Played: " + gamePlayed + ", Won: " + won);
    }
}
