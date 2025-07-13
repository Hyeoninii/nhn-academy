//Quiz 5-7 prob 11
package quiz0507;

public class Prob11 {
    public static void main(String[] args) {
        Playable[] instruments = new Playable[2];
        instruments[0] = new Guitar();
        instruments[1] = new Piano();

        for (Playable instrument : instruments) {
            instrument.play();
        }
    }
} 