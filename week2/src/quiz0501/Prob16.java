//Quiz 5-1 prob 16
package quiz0501;

public class Prob16 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr2 = arr;
        arr2[0] = 10;
        arr2[1] = 99;
        arr[2] = 30;

        System.out.print("Original Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.print("Shared Array: ");
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+ " ");
        }
    }
}
