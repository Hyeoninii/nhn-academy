//Quiz 3-10 prob 4
package quiz0310;

import java.util.Scanner;

public class Prob4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문장을 입력하세요: ");
        String line = sc.nextLine();

        StringBuilder word = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (Character.isLetter(ch)) {
                word.append(ch);
            } else if (ch == '\'') {
                if (i > 0 && i < line.length() - 1 &&
                    Character.isLetter(line.charAt(i - 1)) &&
                    Character.isLetter(line.charAt(i + 1))) {
                    word.append(ch);
                } else {
                    if (word.length() > 0) {
                        System.out.println(word);
                        word.setLength(0);
                    }
                }
            } else {
                if (word.length() > 0) {
                    System.out.println(word);
                    word.setLength(0);
                }
            }
        }
        if (word.length() > 0) {
            System.out.println(word);
        }
        sc.close();
    }
}
