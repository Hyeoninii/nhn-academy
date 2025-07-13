//Quiz 5-3 prob 11
package quiz0503;

public class Prob11 {

    public static void main(String[] args) {
        Rectangle11 r1 = new Rectangle11(1,2);
        Rectangle11 r2 = new Rectangle11(3,4);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r1.equals(r2));
    }
}

class Rectangle11 {
    int width;
    int height;

    public Rectangle11(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "width=" + width + ", height=" + height;
    }
}