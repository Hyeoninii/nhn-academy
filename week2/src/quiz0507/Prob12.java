//Quiz 5-7 prob 12
package quiz0507;

@FunctionalInterface
interface Calculator12 {
    int calculate(int a, int b);
}

public class Prob12 {
    public static void main(String[] args) {
        Calculator12 addition = (a, b) -> a + b;
        Calculator12 subtraction = (a, b) -> a - b;

        System.out.println(addition.calculate(10, 5));
        System.out.println(subtraction.calculate(10, 5));
    }
} 