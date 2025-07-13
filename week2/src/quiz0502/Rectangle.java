//Quiz 5-2 prob 9
package quiz0502;

public class Rectangle {
    int width;
    int height;

    public Rectangle() {}

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(10,20);
        System.out.println(rectangle1.width + " " + rectangle1.height);
        System.out.println(rectangle2.width + " " + rectangle2.height);
    }
}
