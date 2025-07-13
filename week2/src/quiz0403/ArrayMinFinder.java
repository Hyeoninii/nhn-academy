package quiz0403;

public class ArrayMinFinder {
    public static int findMin(int[] list, boolean findMax) {
        try {
            if(findMax) {
                int max = list[0];
                for(int i=1; i<list.length; i++) {
                    if(list[i]>max) { max = list[i]; }
                }
                return max;
            } else {
                int min = list[0];
                for(int i=1; i<list.length; i++) {
                    if(list[i]<min) { min = list[i]; }
                }
                return min;
            }       
        } catch(IllegalArgumentException e) {
            throw new IllegalArgumentException(e);
        }
    }
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8};
        int min = findMin(numbers, false);
        System.out.println("최소값: " + min);
        int max = findMin(numbers, true);
        System.out.println("최대값: " + max);

    }
}

