//Quiz 5-3 prob 6
package quiz0503;

public class Prob6 {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 3);
        System.out.println(r.toString());
    }
}

class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public String toString() {
        return ("width: " +  this.width + ", height: " + this.height);
    }
}