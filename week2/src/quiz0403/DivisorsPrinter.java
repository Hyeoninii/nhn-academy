//Quiz 4-3 prob 2
package quiz0403;

public class DivisorsPrinter {
    public static int[] getDivisors(int N) {
        
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
            }
        }
    int[] arr = new int[count];

    int index = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                arr[index] = i;
                index++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int number = 28; 
        int[] arr = getDivisors(number);
        System.out.print(number+"의 약수: [");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println("]\n");
    }
}