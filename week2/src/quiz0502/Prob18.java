//Quiz 5-2 prob 18
package quiz0502;

public class Prob18 {
    public static void main(String[] args) {
        GameCharacter18 game1 = new GameCharacter18();
        GameCharacter18 game2 = new GameCharacter18("Bob", 55);
        System.out.println("game 1: " + game1.name + " " + game1.health);
        System.out.println("game 2: " + game2.name + " " + game2.health);

    }
}

class GameCharacter18 {
    String name;
    int health;

    public GameCharacter18() {
        this("Alice", 100);
    }
    public GameCharacter18(String name, int health) {
        this.name = name;
        this.health = health;
    }
}
