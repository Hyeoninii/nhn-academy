//Quiz 5-8 prob 12
package quiz0508;

class Outer12 {
    class Inner12 {
        private int value;

        public Inner12(int value) {
            this.value = value;
        }
        public void display() {
            System.out.println(value);
        }
    }
}

public class Prob12 {
    public static void main(String[] args) {
        Outer12 outer = new Outer12();
        Outer12.Inner12 inner = outer.new Inner12(42);
        inner.display();

    }
} 