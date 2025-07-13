//Quiz 3-10 prob 2
package quiz0310;

public class Prob2 {
    public static void main(String[] args) {
        int maxNumber = 0;
        int maxDivisors = 0;

        for (int i = 1; i <= 10000; i++) {
            int count = countDivisors(i);
            if (count > maxDivisors) {
                maxDivisors = count;
                maxNumber = i;
            }
        }

        System.out.println("가장 많은 약수를 가진 정수: " + maxNumber);
        System.out.println("약수의 개수: " + maxDivisors);
    }

    public static int countDivisors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }
}
