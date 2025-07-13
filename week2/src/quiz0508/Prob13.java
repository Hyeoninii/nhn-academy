//Quiz 5-8 prob 13
package quiz0508;

class Outer13 {
    private static String staticMessage = "Static Hello";

    class Inner13 {
        public void display() {
            System.out.println(staticMessage);
        }
    }

}

public class Prob13 {
    public static void main(String[] args) {
        Outer13 outer = new Outer13();
        Outer13.Inner13 inner = outer.new Inner13();
        inner.display();

    }
} 