//Quiz 5-9 prob 6
package quiz0509;

import textio.TextIO;

public class Prob6 {
    public static void main(String[] args) {
        int correctAnswers = 0;
        int totalQuestions = 10;
        
        for (int i = 1; i <= totalQuestions; i++) {
            AdditionQuestion question = new AdditionQuestion();
            
            System.out.println("문제 " + i + ": " + question.getQuestion());
            System.out.print("답: ");
            int userAnswer = TextIO.getlnInt();
            
            if (userAnswer == question.getCorrectAnswer()) {
                System.out.println("정답!");
                correctAnswers++;
            } else {
                System.out.println("틀렸습니다. 정답은 " + question.getCorrectAnswer() + ".");
            }
            System.out.println();
        }
        
        System.out.println("총 문제 수: " + totalQuestions);
        System.out.println("정답 수: " + correctAnswers);
        System.out.println("정답률: " + (correctAnswers * 100.0 / totalQuestions) + "%");
    }
}
