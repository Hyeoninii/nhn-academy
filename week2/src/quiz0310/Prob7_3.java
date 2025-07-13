//Quiz 3-10 Prob 7
package quiz0310;

public class Prob7_3 {
    public static void main(String[] args) {
        boolean[] used = new boolean[365];
        int uniqueCount = 0;
        int people = 0;
        while (uniqueCount < 365) {
            int birthday = (int)(Math.random() * 365);
            people++;
            if (!used[birthday]) {
                used[birthday] = true;
                uniqueCount++;
            }
        }
        System.out.println("365일 중 적어도 하나의 생일이 나올 때까지 뽑은 사람 수: " + people);
    }
} 