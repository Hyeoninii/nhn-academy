//quiz 3-11 prob 10
package quiz0311;

public class Prob10 {
    public static void main(String[] args) {
        String s1 = "1";
        String s2 = "2";
        try {
            int n1 = Integer.parseInt(s1);
            int n2 = Integer.parseInt(s2);
            System.out.println("합계: " + (n1 + n2));
        } catch(NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없습니다.");
        }
    }
}
