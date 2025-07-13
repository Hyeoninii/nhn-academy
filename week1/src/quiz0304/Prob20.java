//Quiz 3-4 prob 20
package quiz0304;

public class Prob20 {
    public static void main(String[] args) {
        for(int i=0; i<5; i++) {
            for(int j=0; j<5-i-1; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<2*i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
} 