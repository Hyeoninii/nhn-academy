//Quiz 5-3 prob 18
package quiz0503;

public class Prob18 {

    public static void main(String[] args) {
        Rectangle18[] arr = new Rectangle18[2];
        arr[0] = new Rectangle18(1,2);
        arr[1] = new Rectangle18(3,4);

        for(Rectangle18 r : arr){
            System.out.println(r.toString());
        }
    }
}

class Rectangle18 {
    int width;
    int height;

    public Rectangle18(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "width=" + width + ", height=" + height;
    }
}