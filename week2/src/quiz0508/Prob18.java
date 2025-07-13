//Quiz 5-8 prob 18
package quiz0508;

class Outer18 {
    class Inner18 {
        private int data;

        public Inner18(int data) {
            this.data = data;
        }
        public void display() {
            System.out.println(data);
        }
    }
}

public class Prob18 {
    public static void main(String[] args) {
        Outer18 outer = new Outer18();
        Outer18.Inner18 inner1 = outer.new Inner18(10);
        Outer18.Inner18 inner2 = outer.new Inner18(20);

        inner1.display();
        inner2.display();

    }
} 