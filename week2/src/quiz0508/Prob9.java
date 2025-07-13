//Quiz 5-8 prob 9
package quiz0508;

class Calculator9 {
    static int base = 10;

    static class Adder9 {
        public int add(int x) {
            return base + x;
        }
    }
}

public class Prob9 {
    public static void main(String[] args) {
        Calculator9.Adder9 adder = new Calculator9.Adder9();
        System.out.println(adder.add(5));

    }
} 