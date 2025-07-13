//Quiz 5-8 prob 17
package quiz0508;

@FunctionalInterface
interface Square17 {
    int calculate(int x);
}

public class Prob17 {
    public static void main(String[] args) {
        Square17 square = x -> x*x;
        System.out.println(square.calculate(5));
    }
} 