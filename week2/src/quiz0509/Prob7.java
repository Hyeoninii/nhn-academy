//Quiz 5-9 prob 4 (Exercise 5.7)
package quiz0509;

import textio.TextIO;

public class Prob7 {
    public static void main(String[] args) {
        IntQuestion[] questions = new IntQuestion[10];
        
        for (int i = 0; i < 5; i++) {
            questions[i] = new AdditionQuestion();
        }
        
        for (int i = 5; i < 9; i++) {
            questions[i] = new SubtractionQuestion();
        }
        
        questions[9] = new IntQuestion() {
            public String getQuestion() {
                return "What is the answer to the ultimate question " +
                         " of life, the universe, and everything?";
            }
            public int getCorrectAnswer() {
                return 42;
            }
        };
        
        int correctAnswers = 0;
        int totalQuestions = questions.length;
        
        for (int i = 0; i < totalQuestions; i++) {
            System.out.println("문제 " + (i + 1) + ": " + questions[i].getQuestion());
            System.out.print("답: ");
            int userAnswer = TextIO.getlnInt();
            
            if (userAnswer == questions[i].getCorrectAnswer()) {
                System.out.println("정답!");
                correctAnswers++;
            } else {
                System.out.println("틀렸습니다. 정답은 " + questions[i].getCorrectAnswer() + ".");
            }
            System.out.println();
        }
        
        System.out.println("총 문제 수: " + totalQuestions);
        System.out.println("정답 수: " + correctAnswers);
        System.out.println("정답률: " + (correctAnswers * 100.0 / totalQuestions) + "%");
    }
}





