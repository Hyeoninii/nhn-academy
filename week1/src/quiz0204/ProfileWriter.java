package quiz0204;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Quiz 2-4 prob 5
public class ProfileWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        String color;

        System.out.print("이름을 입력하세요: ");
        name = scanner.nextLine();

        System.out.print("나이를 입력하세요: ");
        age = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기

        System.out.print("좋아하는 색을 입력하세요: ");
        color = scanner.nextLine();

        try (FileWriter writer = new FileWriter("profile.txt")) {
            writer.append("이름: ").append(name).append("\n")
            .append("나이: ").append(Integer.toString(age)).append("\n")
            .append("좋아하는 색: ").append(color);
            System.out.println("profile.txt에 저장되었습니다.");
        } catch (IOException e) {
            System.out.println("파일 저장 중 오류 발생: " + e.getMessage());
        }

        scanner.close();

    }    
}
