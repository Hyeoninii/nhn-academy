//Quiz 5-5 prob 9
package quiz0505;

import java.util.Arrays;

public class Prob9 {
    public static void main(String[] args) {
        Shape[] arr = new Shape[3];
        arr[0] = new Rectangle(2);
        arr[1] = new Circle(3);
        arr[2] = new Oval(1);

        Arrays.sort(arr);

        for(Shape s : arr) {
            s.printInfo();
        }

    }
}
