//Quiz 5-3 prob 8
package quiz0503;

public class Prob8 {

    public static void main(String[] args) {
        Circle[] c = {new Circle(2), new Circle(3)};

        for(Circle circle : c){
            System.out.println(circle.radius + " ");
        }

    }
}

class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
}