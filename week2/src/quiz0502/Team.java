//Quiz 5-2 prob 11
package quiz0502;

public class Team {
    String[] players;

    public Team(int size) {
        players = new String[size];
    }
    public void print() {
        for (String player : players) {
            System.out.print(player + " ");
        }
    }

    public static void main(String[] args) {
        Team team = new Team(3);
        team.players[0] = "Alice";
        team.players[1] = "Bob";
        team.players[2] = "Charlie";
        team.print();
    }
}
