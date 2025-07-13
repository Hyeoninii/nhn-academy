package quiz0204;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//Quiz 2-4 prob 6
public class FileSumAndAverage {
    public static void main(String[] args) {
        try (Scanner fileScanner = new Scanner(new File("numbers.txt"))) {
            int sum = 0;
            int count = 0;

            while (fileScanner.hasNextInt()) {
                sum += fileScanner.nextInt();
                count++;
            }

            System.out.println("합: " + sum);
            if (count > 0) {
                System.out.println("평균 : " + sum/count);
            } else {
                System.out.println("평균: 계산할 수 없음 (숫자가 없습니다).");
            }

        } catch (IOException e) {
            System.out.println("파일 읽기 오류: " + e.getMessage());
        }
    }
}

