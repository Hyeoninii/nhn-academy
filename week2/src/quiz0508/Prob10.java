//Quiz 5-8 prob 10
package quiz0508;

class Outer10 {
    private String message = "Hello from Outer";

    class Inner10 {
        public void display() {
            System.out.println(message);
        }
    }
}

public class Prob10 {
    public static void main(String[] args) {
        Outer10 outer = new Outer10();
        Outer10.Inner10 inner = outer.new Inner10();
        inner.display();

    }
} 