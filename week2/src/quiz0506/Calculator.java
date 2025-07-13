package quiz0506;

public class Calculator {
    private int result;

    public void add(int value) {
        this.result += value;
    }

    //Quiz 5-6 prob 2
    public void subtract(int value) {
        this.result -= value;
    }

    public void displayResult() {
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(10);
        calc.subtract(5);
        calc.displayResult(); // Result: 5 출력
    }

}
