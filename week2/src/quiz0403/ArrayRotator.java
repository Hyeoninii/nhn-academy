//Quiz 4-3 prob 18
package quiz0403;

public class ArrayRotator {
     public static int[] rotateArray(int[] list, int k) {
        int[] newArr = new int[list.length];
        for(int i=0; i<newArr.length; i++) {
            newArr[i] = list[(i-k+list.length)%list.length];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int k = 2;
        int[] rotated = rotateArray(numbers, k);
        System.out.print("회전된 배열: ");
        for (int value : rotated) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
