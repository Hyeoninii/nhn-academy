//Quiz 4-3 prob 11
package quiz0403;

public class countOccurrences {
    public static int countOccurrences(int[] list, int target) {
        int count = 0;
        for (int j : list) {
            if (j == target) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 2, 5};
        int target = 2;
        System.out.println("숫자 " + target + "의 등장 횟수: " + countOccurrences(numbers, target));

    }
}
