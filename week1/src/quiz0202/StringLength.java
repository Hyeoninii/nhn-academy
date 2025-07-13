package quiz0202;

//Quiz 2-2 문제 1
public class StringLength {
    public static void main(String[] args) {
        String name = "Java Programming";
        StringBuilder builder = new StringBuilder();

        builder.append("문자열: ");
        builder.append(name);
        builder.append("\n문자열 길이: ");
        builder.append(name.length());

        System.out.println(builder.toString());
    }
}