package quiz0204;

import java.util.Scanner;

//Quiz 2-4 prob 8
public class CSVProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String csvString;
        String[] values;

        System.out.print("CSV 형식 데이터를 입력하세요: ");
        csvString = scanner.nextLine();
        values = csvString.split(",");
        
        for (String value : values) {
            System.out.println(value.trim());
        }

        scanner.close();
    }
}
