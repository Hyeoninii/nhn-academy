//Quiz 3-10 prob 3
package quiz0310;

import textio.TextIO;

public class Prob3 {
    public static void main(String[] args) {
        TextIO.put("수식을 입력하세요: ");
        String expression = TextIO.getln();
        String[] tokens = expression.split(" ");
        int result;

        if(tokens[1].equals("+")) {
            result = Integer.parseInt(tokens[0]) + Integer.parseInt(tokens[2]);
        }
        else if(tokens[1].equals("-")) {
            result = Integer.parseInt(tokens[0]) - Integer.parseInt(tokens[2]);
        }
        else if(tokens[1].equals("*")) {
            result = Integer.parseInt(tokens[0]) * Integer.parseInt(tokens[2]);
        } else if(tokens[1].equals("/")) {
            result = Integer.parseInt(tokens[0]) / Integer.parseInt(tokens[2]);
        } else {
            TextIO.putln("잘못된 수식입니다.");
            return;
        }
        TextIO.putln("결과: " + result);
    }
}
