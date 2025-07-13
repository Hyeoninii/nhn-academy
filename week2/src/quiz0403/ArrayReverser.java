//Quiz 4-3 prob 9
package quiz0403;

public class ArrayReverser {
    public static void reverseArray(int[] list) {
        int[] temp = new int[list.length];
        System.arraycopy(list, 0, temp, 0, list.length);
        for(int i=0; i<temp.length; i++) {
            list[i] = temp[temp.length-i-1];
        }
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        reverseArray(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
