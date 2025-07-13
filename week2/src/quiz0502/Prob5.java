//Quiz 5-2 prob 5
package quiz0502;

public class Prob5 {

    public static void main(String[] args) {
        Character5 character = new Character5();
        System.out.println("캐릭터 이름: " + character.name + ", 체력: " +  character.health + ", 생존: " + character.isAlive);
    }
}

class Character5 {
    String name;
    int health;
    boolean isAlive;


    public Character5() {
        this.name = "Alice";
        this.health = 100;
        this.isAlive = true;
    }
}
