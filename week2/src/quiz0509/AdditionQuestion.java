package quiz0509;

public class AdditionQuestion implements IntQuestion {
    private int a, b;

    public AdditionQuestion() {
        a = (int)(Math.random() * 50 + 1);
        b = (int)(Math.random() * 50);
    }

    public String getQuestion() {
        return a + " + " + b + " ?";
    }

    public int getCorrectAnswer() {
        return a + b;
    }
}