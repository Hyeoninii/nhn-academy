//quiz 4-2 prob 7
package quiz0402;

public class Prob7 {
    static final String name = "Guest";
    public static void main(String[] args) {
        greet("xtra");
        greet(null);
    }
    static void greet(String name) {
        if(name == null) {
            System.out.println("Hi, " + Prob7.name + "!");
        } else {
            System.out.println("Hi, " + name + "!");
        }
    }
}
