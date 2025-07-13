//Quiz 3-3 prob 14
package quiz0303;

import java.util.Scanner;

public class Prob14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr;
        System.out.print("문자열을 입력하세요 (종료: 'end'): ");
        arr = sc.nextLine().split(" ");

        for(int i=0; i<arr.length; i++) {
            if(arr[i].equals("end")) {
                break;
            }
            if(arr[i].length() <= 3) {
                System.out.println("짧은 문자열: " + arr[i]);
            }
        }

        sc.close();
    }
}
