//Quiz 5-1 prob 1
package quiz0501;

public class PlayerData {
    String name;
    int age;

    public PlayerData(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        PlayerData player = new PlayerData("John", 25);
        System.out.printf("이름: %s, 나이: %d%n", player.name, player.age);
    }
}
