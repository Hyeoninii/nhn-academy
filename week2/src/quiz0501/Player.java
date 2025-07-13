//Quiz 5-1 prob 11
package quiz0501;

public class Player {
    String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public static void main(String[] args) {
        Player[] parr = new Player[3];
        parr[0] = new Player("Alice", 90);
        parr[1] = new Player("Bob", 85);
        parr[2] = new Player("Charlie", 88);

        for (Player player : parr) {
            System.out.println("이름: " + player.name + ", 점수: " + player.score);
        }
        System.out.println();
    }
}
