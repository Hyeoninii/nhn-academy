//Quiz 5-1 prob 10
package quiz0501;

public class Prob10 {
    int[] arr = {1, 2, 3};
    public static void main(String[] args) {
        Prob10 prob = new Prob10();
        Prob10 prob2 = prob;

        prob.arr[0] = 10;

        System.out.print("Original Array: ");
        for(int i = 0; i < prob.arr.length; i++) {
            System.out.print(prob.arr[i]+ " ");
        }
        System.out.println();
        System.out.print("Reference Array: ");
        for(int i = 0; i < prob2.arr.length; i++) {
            System.out.print(prob2.arr[i]+ " ");
        }
    }
}
