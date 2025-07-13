//Quiz 5-5 prob 17
package quiz0505;

public class Prob17 {
    public static void main(String[] args) {
        Shape[] arr = new Shape[2];
        arr[0] = new Rectangle();
        arr[1] = new Circle();
        for(Shape s : arr) {
            switch (s) {
                case Rectangle rectangle -> System.out.println("사각형");
                case Circle circle -> System.out.println("원");
                case Oval oval -> System.out.println("타원");
                case null, default -> System.out.println("그 외");
            }
        }
    }
}
