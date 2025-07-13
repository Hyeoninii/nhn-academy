//quiz 3-11 prob 15
package quiz0311;

public class Prob15 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for(int i=0; i<numbers.length; i++) {
            numbers[i] = (int)(Math.random()*100);
        }
        int min = numbers[0];
        int max = numbers[0];
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            }
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        double[] raceTimes = new double[max - min];
        System.out.println("배열의 범위: " + raceTimes.length);
    }
}
