//Quiz 5-8 prob 3
package quiz0508;

public class Prob3 {
    public static void main(String[] args) {
        OuterClass3 outer = new OuterClass3();
        OuterClass3.InnerClass3 inner = outer.new InnerClass3();
        inner.displayMessage(); // "Hello from OuterClass" 출력
    }
}

class OuterClass3 {
    private String message = "Hello from OuterClass";

    class InnerClass3 {
        public void displayMessage() {
            System.out.println(message);
        }
    }
}