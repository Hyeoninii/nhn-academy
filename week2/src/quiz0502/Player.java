//Quiz 5-2 prob 3
package quiz0502;

public class Player {
    String name;
    int score;
    
    public Player() {
        this.name = "Player";
        this.score = 0;
    }
    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player("Bob", 80);
        System.out.println("기본 생성자 이름: "+ p1.name+", 기본 생성자 점수: "+p1.score);
        System.out.println("매개변수 생성자 이름: "+ p2.name+", 매개변수 생성자 점수: "+p2.score);
    }
}
