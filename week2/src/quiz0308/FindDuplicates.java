//quiz 3-8 prob 5
package quiz0308;

import java.util.Scanner;
import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int[] numbers = new int[sc.nextInt()];

        System.out.print("배열의 크기만큼 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();


        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]) {
                    set.add(numbers[i]);
                    break;
                }
            }
        }

        System.out.print("중복된 값: ");
        for(int i : set) {
            System.out.print(i + " ");
        }

        System.out.println();
        sc.close();
    }
}
