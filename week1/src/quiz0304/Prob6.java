//Quiz 3-4 prob 6
package quiz0304;

import java.util.Scanner;

public class Prob6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int n = sc.nextInt();
        int count = 0;

        System.out.print("약수 개수: ");
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
} 