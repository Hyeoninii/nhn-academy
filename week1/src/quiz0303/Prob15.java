//Quiz 3-3 prob 15
package quiz0303;

public class Prob15 {
    public static void main(String[] args) {
        int n = 1;

        while(n < 5) {
            
            for(int i=0; i<n; i++) {
                System.out.print('*');
            }
            System.out.println();
            n++;
        }
    }
}
