//quiz 3-8 prob 12
package quiz0308;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열 행의 길이를 입력하세요: ");
        int size = sc.nextInt();

        int[][] array= new int[size][0];
        int maxCol = 0;

        for(int i = 0 ; i < size ; i++) {
            System.out.printf("배열의 %d번째 열의 길이를 입력하세요: ", i + 1);
            int length = sc.nextInt();
            if(length > maxCol) {
                maxCol = length;
            }
            array[i] = new int[length];
            System.out.printf("배열의 요소를 입력하세요: ");
            for (int j = 0; j < length ; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int[] rowSum = new int[size];
        int[] colSum = new int[maxCol];
        for(int i = 0 ; i < size ; i++) {
            for(int j = 0 ; j < array[i].length; j++) {
                rowSum[i] += array[i][j];
            }
            System.out.println((i + 1) + "번째 행의 합: " + rowSum[i]);
        }
        for(int i = 0 ; i < maxCol ; i++) {
            for(int j = 0 ; j < size ; j++) {
                if(i >= array[j].length) {
                    continue;
                }
                colSum[i] += array[j][i];
            }
            System.out.println((i + 1) + "번째 열의 합: " + colSum[i]);
        }
        sc.close();

    }
}
