package quiz0204;

import java.util.Scanner;

//Quiz 2-4 prob 9
public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        System.out.print("실수 배열을 입력하세요 (공백으로 구분): ");
        String input = scanner.nextLine();

        String[] parts = input.trim().split("\\s+");
        double[] numbers = new double[parts.length];

        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Double.parseDouble(parts[i]);
            if(numbers[i]>max) max = numbers[i];
            if(numbers[i]<min) min = numbers[i];
        }

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);

        scanner.close();
    }
}
