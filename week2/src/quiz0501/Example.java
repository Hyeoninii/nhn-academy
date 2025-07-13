//Quiz 5-1 prob 15
package quiz0501;

public class Example {
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
    void instanceMethod() {
        System.out.println("This is an instance method.");
    }
    public static void main(String[] args) {
        staticMethod();
        Example example = new Example();
        example.instanceMethod();
    }
}
