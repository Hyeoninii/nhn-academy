//Quiz 5-6 prob 4
package quiz0506;

class Parent {
    String name = "Parent";
}

class Child extends Parent {
    String name = "Child";

    public void displayNames() {
        System.out.println("Name from child: " + this.name);
        System.out.println("Name from parent: " + super.name);
    }
}

public class Prob4 {
    public static void main(String[] args) {
        Child child = new Child();
        child.displayNames();
    }
}
