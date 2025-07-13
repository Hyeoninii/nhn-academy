//Quiz 5-1 Prob 7
package quiz0501;

public class Team {
    static String teamName = "Warriors";
    String playerName;
    public Team(String playerName) {
        this.playerName = playerName;
    }

    public static void main(String[] args) {
        Team player1 = new Team("Alice");
        Team player2 = new Team("Bob");
        System.out.println("Player 1: " + player1.playerName);
        System.out.println("Player 2: " + player2.playerName);
        System.out.println("Team Name: " + Team.teamName);
    }

}
