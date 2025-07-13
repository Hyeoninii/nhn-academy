//Quiz 5-8 prob 16
package quiz0508;

public class Prob16 {
    public int addNumbers(int a, int b) {
        class Adder16 {
            public int add(int x, int y) {
                return x + y;
            }
        }
        Adder16 adder = new Adder16();
        return adder.add(a, b);
    }
    public static void main(String[] args) {
        Prob16 prob = new Prob16();
        System.out.println(prob.addNumbers(3, 7));
    }
}
