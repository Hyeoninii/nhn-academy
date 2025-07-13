package quiz0502;

public class Prob17 {
}

class Rectangle17 {
    int width;
    int height;

    public Rectangle17(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle17(Rectangle17 r) {
        this.width = r.width;
        this.height = r.height;
    }

    public static void main(String[] args) {
        Rectangle17 r1 = new Rectangle17(10, 20);
        Rectangle17 r2 = new Rectangle17(r1);

        System.out.println("r1: " + r1.width + " " + r1.height);
        System.out.println("r2: " + r2.width + " " + r2.height);
    }
}
