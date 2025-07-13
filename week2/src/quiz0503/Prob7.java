//Quiz 5-3 prob 7
package quiz0503;

public class Prob7 {

    public static void main(String[] args) {
        Circle7 c = new Circle7(2, 0, 0);
        c.draw();
    }
}

class Circle7 {
    int radius;
    int x, y;

    public Circle7(int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    void draw() {
        System.out.println("radius: " + radius +  ", x: " + x + ", y: " + y);
    }
}