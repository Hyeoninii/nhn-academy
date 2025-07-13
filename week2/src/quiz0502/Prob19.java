//Quiz 5-2 prob 19
package quiz0502;

class Circle19 {
    double radius;
    double area;

    public Circle19(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }
}

public class Prob19 {
    public static void main(String[] args) {
        Circle19 circle = new Circle19(5);
        System.out.println("circle area: " + circle.area + ", circle radius: " + circle.radius);
    }
}
