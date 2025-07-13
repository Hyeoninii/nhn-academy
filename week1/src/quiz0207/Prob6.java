package quiz0207;

import textio.TextIO;

//Quiz 2-7 prob 6
public class Prob6 {
    public static void main(String[] args) {
        TextIO.putln("이름과 성을 공백으로 구분하여 입력하세요. ");
        String line = TextIO.getln();

        int spaceIndex = line.indexOf(' ');
        String firstName = line.substring(0, spaceIndex);
        String lastName = line.substring(spaceIndex + 1);
        TextIO.putln("이름은 " + firstName+"이며, "+firstName.length()+"개의 문자로 구성됩니다.");
        TextIO.putln("성은 " + lastName+"이며, "+lastName.length()+"개의 문자로 구성됩니다.");
        TextIO.putln("이니셜은 "+firstName.charAt(0)+lastName.charAt(0)+"입니다.");
    }
}
