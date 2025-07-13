//Quiz 5-5 prob 16
package quiz0505;

public class Prob16 {
    public static void main(String[] args) {
        Shape[] arr = new Shape[2];
        arr[0] = new Rectangle();
        arr[1] = new Circle();
        for(Shape s : arr) {
            s.draw();
        }
    }
}
