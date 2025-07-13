//Quiz 5-2 prob 10
package quiz0502;

public class Game {
    String name;

    public Game() {
        this("Unknown");
    }
    public Game(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        Game game1 = new Game();
        Game game2 = new Game("Game 2");

        System.out.println(game1.name);
        System.out.println(game2.name);
    }
}
