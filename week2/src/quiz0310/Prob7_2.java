//Quiz 3-10 Prob 7
package quiz0310;

public class Prob7_2 {
    public static void main(String[] args) {
        boolean[] used = new boolean[365];
        int uniqueCount = 0;
        for (int i = 0; i < 365; i++) {
            int birthday = (int)(Math.random() * 365);
            if (!used[birthday]) {
                used[birthday] = true;
                uniqueCount++;
            }
        }
        System.out.println("365명을 뽑았을 때 생일의 가짓수: " + uniqueCount);
    }
} 