//Quiz 5-8 prob 2
package quiz0508;

public class Prob2 {
    public static void main(String[] args) {
        MathOperations2.Addition2 addition = new MathOperations2.Addition2();
        System.out.println(addition.add(5, 3)); // 8 출력
    }
}

class MathOperations2 {
    static class Addition2 {
        public int add(int a, int b) {
            return a + b;
        }
    }
}