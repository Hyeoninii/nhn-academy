//Quiz 4-3 prob 12
package quiz0403;

public class ArrayValueChecker {
    public static boolean containsValue(int[] list, int target) {
        for(int i=0; i<list.length; i++) {
            if(list[i]==target) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9};
        int target = 5;
        System.out.println("숫자 " + target + " 포함 여부: " + containsValue(numbers, target));
       
    }
}
