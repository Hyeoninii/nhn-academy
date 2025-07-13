//Quiz 4-3 prob 14
package quiz0403;

public class ArrayMerger {
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArr = new int[arr1.length+arr2.length];
        System.arraycopy(arr1, 0, mergedArr, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArr, arr1.length, arr2.length);
        return mergedArr;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] result = mergeArrays(array1, array2);
        System.out.print("병합된 배열: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}