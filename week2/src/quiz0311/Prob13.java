//quiz 3-11 prob 13
package quiz0311;

// R M N이 출력된다.
// startWord가 true일 때 문자를 출력하고, 공백을 만나면 startWord를 true로 변경한다.
// 그래서 공백 바로 뒤의 문자를 출력한다.
public class Prob13 {
    public static void main(String[] args) {
        String name;
        int i;
        boolean startWord;

        name = "Richard M. Nixon";
        startWord = true;
        for (i = 0; i < name.length(); i++) {
        if (startWord)
            System.out.println(name.charAt(i));
        if (name.charAt(i) == ' ')
            startWord = true;
        else
            startWord = false;
        }
    }
}
