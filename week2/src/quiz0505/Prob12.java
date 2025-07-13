//Quiz 5-5 prob 12
package quiz0505;

public class Prob12 {

    static double getTotalSize(Shape[] sArr) {
        double totalSize = 0;
        for (Shape s : sArr) {
            totalSize += s.getSize();
        }
        return totalSize;
    }

    public static void main(String[] args) {
        Shape[] arr = new Shape[2];
        arr[0] = new Rectangle(1);
        arr[1] = new Triangle(2);
        System.out.println(getTotalSize(arr));
    }
}
