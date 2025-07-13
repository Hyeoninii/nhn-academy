package quiz0509;

class SubtractionQuestion implements IntQuestion {
    private int a, b;

    public SubtractionQuestion() { 
        a = (int)(Math.random() * 50 + 1);
        b = (int)(Math.random() * a);
    }

    public String getQuestion() {
        return a + " - " + b + " ?";
    }

    public int getCorrectAnswer() {
        return a - b;
    }
}