package quiz0403;

public class ArrayIntersection {
    public static int[] intersectArrays(int[] arr1, int[] arr2) {
        int[] temp = new int[Math.min(arr1.length, arr2.length)];
        int count = 0;
        for (int k : arr1) {
            for (int j = 0; j < arr2.length; j++) {
                if (k == arr2[j]) {
                    temp[count++] = k;
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }

        int[] intersection = new int[count];
        System.arraycopy(temp, 0, intersection, 0, count);
        return intersection;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {3, 4, 5, 6};
        int[] intersection = intersectArrays(array1, array2);
        System.out.print("교집합 배열: ");
        for (int value : intersection) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
