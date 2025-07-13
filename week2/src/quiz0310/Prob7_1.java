//Quiz 3-10 Prob 7
package quiz0310;

public class Prob7_1 {
    public static void main(String[] args) {
        int[] used = new int[365];
        int count = 0;
        while (true) {
            int birthday = (int)(Math.random() * 365);
            count++;
            used[birthday]++;
            if (used[birthday] == 3) {
                break;
            }
        }
        System.out.println("세 명이 같은 생일을 가질 때까지 뽑은 사람 수: " + count);
    }
} 