//quiz 3-8 prob 4
package quiz0308;

import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int[] numbers = new int[sc.nextInt()];

        System.out.print("배열의 크기만큼 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("배열에서 찾을 값을 입력하세요: ");
        int target = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                System.out.println(numbers[i] + "는 인덱스 " + i + "에 존재합니다.");
                break;
            }
        }

        if(!found) {
            System.out.println("존재하지 않음");
        }

        sc.close();
    }
}
