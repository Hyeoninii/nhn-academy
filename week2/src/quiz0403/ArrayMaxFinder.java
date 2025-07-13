//Quiz 4-3 prob 6
package quiz0403;

public class ArrayMaxFinder {
    public static int findMax(int[] list) {
        try {
        int max = list[0];
            for(int i=1; i<list.length; i++) {
                if(list[i]>max) { max = list[i]; }
            }
        return max;
        } catch(IllegalArgumentException e) {
            throw new IllegalArgumentException(e);
        }
    }
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8};
        int max = findMax(numbers);
        System.out.println("최대값: " + max);

    }
}
