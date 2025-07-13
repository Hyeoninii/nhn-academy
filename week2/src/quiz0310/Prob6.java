//Quiz 3-10 Prob 6
package quiz0310;

public class Prob6 {
    public static void main(String[] args) {
        int n = 10000;
        int[] divisorCount = new int[n+1];
        int maxDivisors = 0;

        for (int i=1; i<=n; i++) {
            int count = 0;
            for (int j=1; j<=i; j++) {
                if (i%j==0) count++;
            }
            divisorCount[i] = count;
            if (count>maxDivisors) {
                maxDivisors = count;
            }
        }

        System.out.println("Among integers between 1 and 10000,");
        System.out.println("The maximum number of divisors was " + maxDivisors);
        System.out.println("Numbers with that many divisors include:");
        for (int i=1; i<=n; i++) {
            if (divisorCount[i] == maxDivisors) {
                System.out.println("   " + i);
            }
        }
    }
}
