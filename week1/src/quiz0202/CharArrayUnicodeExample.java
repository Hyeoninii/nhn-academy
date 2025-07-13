package quiz0202;

//Quiz 2-2 문제 8
public class CharArrayUnicodeExample {
    public static void main(String[] args) {
        char[] chars = {'A','가','☺'};
        for(char ch : chars) {
            System.out.println("문자: " + ch +", 유니코드 값: " + Integer.toHexString(ch));
        }
    }
}