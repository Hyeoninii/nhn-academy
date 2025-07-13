//Quiz 5-8 prob 1
package quiz0508;

public class Prob1 {
    public static void main(String[] args) {
        OuterClass1.NestedClass1 nested = new OuterClass1.NestedClass1();
        nested.printMessage(); // "Hello from NestedClass"
    }
}

class OuterClass1 {
    static class NestedClass1 {
        public void printMessage() {
            System.out.println("Hello from Nested Class");
        }
    }
}