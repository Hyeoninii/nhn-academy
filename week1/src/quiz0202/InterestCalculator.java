package quiz0202;

//Quiz 2-2 문제 1
public class InterestCalculator {
    public static void main(String[] args) {
        float rate = 0.05f; //연이율
        float principal = 15000;   //투자 금액
        float interest = principal*rate;     //이자

        System.out.println("이자는: " + interest);
    }
}