//Quiz 5-7 prob 5
package quiz0507;

public class Prob5 {
    public static void main(String[] args) {
        Flyable[] flyers = new Flyable[2];
        flyers[0] = new Bird();
        flyers[1] = new Airplane();

        for (Flyable flyer : flyers) {
            flyer.fly(); // 각 클래스에 맞는 메시지 출력
        }
    }
} 