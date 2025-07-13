//Quiz 4-3 prob 13
package quiz0403;

public class ArrayElementRemover {
    public static int[] removeElement(int[] list, int target) {
        int count = 0;
        int tempIndex = 0;
        for (int k : list) {
            if (k == target) count++;
        }
        int[] temp = new int[list.length-count];
        for (int j : list) {
            if (j != target) {
                temp[tempIndex] = j;
                tempIndex++;
            } else {
                continue;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 2, 5};
        int target = 2;
        int[] result = removeElement(numbers, target);
        System.out.print("결과 배열: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}