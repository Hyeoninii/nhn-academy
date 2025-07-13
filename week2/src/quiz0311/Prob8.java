//quiz 3-11 prob 8
package quiz0311;

import textio.TextIO;

public class Prob8 {
    public static void main(String[] args) {
        TextIO.put("정수를 입력하세요: ");
        int n = TextIO.getInt();
        if(n%2 == 0) {
            TextIO.putln("짝수입니다.");
        } else {
            TextIO.putln("홀수입니다.");
        }
    }
}
