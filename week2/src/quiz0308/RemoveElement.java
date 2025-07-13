//quiz 3-8 prob 6
package quiz0308;

import java.util.Scanner;
import java.util.ArrayList;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int[] numbers = new int[sc.nextInt()];

        System.out.print("배열의 크기만큼 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("배열에서 제거할 값을  입력하세요: ");
        int target = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] != target) {
                list.add(numbers[i]);
            }
        }

        for(int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();

        sc.close();
    }
}
