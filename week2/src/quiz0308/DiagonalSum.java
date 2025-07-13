//quiz 3-8 prob 10
package quiz0308;

import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("2차원 배열의 크기를 입력하세요: ");
        int rowColumn = sc.nextInt();

        int[][] matrix = new int[rowColumn][rowColumn];

        for (int i = 0; i < rowColumn; i++) {
            System.out.print((i + 1) + "번째 열의 정수를 입력하세요: ");
            for (int j = 0; j < rowColumn; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int diagonalSum = 0;
        int reverseDiagonalSum = 0;

        for(int i=0; i<rowColumn; i++) {
            diagonalSum += matrix[i][i];
            reverseDiagonalSum += matrix[i][rowColumn - i - 1];
        }

        System.out.println("주 대각선 합: " + diagonalSum);
        System.out.println("부 대각선 합: " + reverseDiagonalSum);
        sc.close();
    }
}
