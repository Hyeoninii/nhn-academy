//Quiz 5-6 prob 13
package quiz0506;

class Parent13 {
    public void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child13 extends Parent13 {
    @Override
    public void greet() {
        System.out.println("Hello from Child");
    }

    public void callGreetMethods() {
        this.greet();
        super.greet();
    }
}

public class Prob13 {
    public static void main(String[] args) {
        Child13 child = new Child13();
        child.callGreetMethods();

    }
}
