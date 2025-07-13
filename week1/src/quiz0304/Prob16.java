//Quiz 3-4 prob 16
package quiz0304;

public class Prob16 {
    public static void main(String[] args) {
        int[] arr = {3, 7, 10, 5};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("합: "+sum);
    }
} 