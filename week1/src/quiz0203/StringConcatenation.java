package quiz0203;

import java.util.Scanner;

//Quiz 2-3 prob 8
public class StringConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();

        StringBuilder message = new StringBuilder();
        message.append("안녕, ").append(name)
        .append(". 당신의 나이는 ").append(age).append("살입니다.\n")
        .append("내년에는 ").append(age+1).append("살이 되는군요.");
    
        message.toString();
        System.out.println(message);

        scanner.close();
    }
}
