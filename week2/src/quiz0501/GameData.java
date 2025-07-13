//Quiz 5-1 prob 2
package quiz0501;

public class GameData {
    static int totalPlayers = 0;
    String playerName;

    public GameData(String playerName) {
        this.playerName = playerName;
        totalPlayers++;
    }

    public static void main(String[] args) {
        GameData player1 = new GameData("Alice");
        GameData player2 = new GameData("Bob");

        System.out.printf("총 플레이어 수: %d", GameData.totalPlayers);
    }
}
