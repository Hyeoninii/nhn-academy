//Quiz 5-1 prob 15
package quiz0501;

public class Prob15 {
    public static void main(String[] args) {
        Student st1 = new Student("Alice", 85);
        Student st2 = st1;
        st2.name = "Bob";

        System.out.println("Student 1 Name: " + st1.name);
        System.out.println("Student 2 Name: " + st2.name);
    }
}
