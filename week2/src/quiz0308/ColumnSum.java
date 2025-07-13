//quiz 3-8 prob 9
package quiz0308;

import java.util.Scanner;

public class ColumnSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("2차원 배열의 크기를 입력하세요: ");
        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] matrix = new int[row][column];

        for (int i = 0; i < row; i++) {
            System.out.print((i + 1) + "번째 행의 정수를 입력하세요: ");
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[] sumArr = new int[column];
        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                sumArr[j] += matrix[i][j];
            }
        }
        for(int i=0; i<column; i++) {
            System.out.println((i + 1) + "번째 열의 합: " + sumArr[i]);
        }
        sc.close();
    }
}
