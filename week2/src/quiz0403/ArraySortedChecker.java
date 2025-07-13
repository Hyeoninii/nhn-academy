//Quiz 4-3 prob 19
package quiz0403;

public class ArraySortedChecker {
    public static boolean isSorted(int[] list) {
        for(int i=0; i<list.length-1; i++) {
            if(list[i]>list[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("정렬 여부: " + isSorted(numbers));
    }

}
