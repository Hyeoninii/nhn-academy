package quiz0203;

import java.util.Scanner;

//Quiz 2-3 prob 5
public class CharacterSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String line = sc.nextLine();
        System.out.print("검색할 문자를 입력하세요: ");
        String target = sc.next();
        int position = line.indexOf(target);

        if (position != -1) {
            System.out.println("문자 '" + target + "'의 위치: " + position);
        } else {
            System.out.println("문자 '" + target + "'는 문자열에 없습니다.");
        }

        sc.close();


    }
}
