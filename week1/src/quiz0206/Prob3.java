package quiz0206;

import textio.TextIO;

//Quiz 2-6 prob 3
public class Prob3 {
    public static void main(String[] args) {
        String name;
        int age;
        TextIO.put("이름: ");
        name = TextIO.getln();
        TextIO.put("나이: ");
        age = Integer.parseInt(TextIO.getln());

        TextIO.putln("이름: " + name + ", 나이: " + age);
    }
}
