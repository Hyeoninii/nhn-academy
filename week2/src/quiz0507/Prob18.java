//Quiz 5-7 prob 18
package quiz0507;

public class Prob18 {
    public static void main(String[] args) {

        Speaker speaker = new Speaker() {
            @Override
            public void speak() {
                System.out.println("Hello from an anonymous class!");
            }
        };

        speaker.speak(); // "Hello from an anonymous class!" 출력
    }
} 