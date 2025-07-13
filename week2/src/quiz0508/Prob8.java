//Quiz 5-8 prob 8
package quiz0508;

interface Drawable {
    void draw();
}

public class Prob8 {
    public static void main(String[] args) {
        Drawable drawable = () -> {
            System.out.println("Drawing a shape");
        };
        drawable.draw();
    }
} 