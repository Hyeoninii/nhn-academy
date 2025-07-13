package quiz0202;

//Quiz 2-2 문제 5
public class MonthlyInterest {
    public static void main(String[] args) {
        double balance = 100;
        double monthlyRate = 0.05;

        for(int month = 1; month <= 12; month++) {
            balance += balance * monthlyRate;
        }

        System.out.println("최종 잔액: " + balance);
    }
}