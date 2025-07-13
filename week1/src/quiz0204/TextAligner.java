package quiz0204;

import java.util.ArrayList;
import java.util.Scanner;

//Quiz 2-4 prob 10
public class TextAligner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();

        System.out.println("텍스트를 입력하세요 (종료하려면 빈 줄을 입력):");
        int maxLength = 0;

        while (true) {
            String line = scanner.nextLine();

            if (line == "") {
                break;
            }

            if(line.length()>maxLength) maxLength = line.length();
            lines.add(line);

        }
        String formet = "%"+maxLength+"s%n";

        System.out.println("\n오른쪽 정렬된 텍스트:");
        for (String line : lines) {     
            System.out.printf(formet, line);    
        }

        scanner.close();
    }
}
