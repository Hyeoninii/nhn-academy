package quiz0203;

import java.util.Scanner;

//Quiz 2-3 prob 9
public class PrintSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;
        int start;
        int end;
        String subString;

        System.out.print("문장을 입력하세요: ");
        line = sc.nextLine();
        
        System.out.print("시작 위치를 입력하세요: ");
        start = sc.nextInt();
        System.out.print("끝 위치를 입력하세요: ");
        end = sc.nextInt();
        System.out.print("부분 문자열: ");
        subString = line.substring(start, end);
        System.out.println(subString);

        sc.close();
    }
}
