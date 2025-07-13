//Quiz 5-9 prob 2
package quiz0509;

import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StatCalc calc = new StatCalc();

        while(true) {
            double n = sc.nextDouble();
            if(n==0) {break;}
            calc.enter(n);
        }
        System.out.println("min: "+calc.getMin());
        System.out.println("max: "+calc.getMax());
    }
}

class StatCalc {
    private int count;
    private double sum;
    private double squareSum;
    private double min = Integer.MAX_VALUE;
    private double max = Integer.MIN_VALUE;
    public double getMin() { return min; }
    public double getMax() { return max; }

    public int getCount() { return count; }
    public double getSum() { return sum; }
    public double getSquareSum() { return squareSum; }
    public double getAverage() { return sum/count; }
    public double getStandardDeviation() { return Math.sqrt((squareSum-getAverage()*getAverage())/(count-1)); }

    public void enter(double num) {
        count++;
        sum += num;
        squareSum += num*num;
        if(num < min) {
            min = num;
        }
        if(num > max) {
            max = num;
        }
    }
    @Override
    public String toString() {
        return "총 시도 횟수: " + count + ", 총 합: " + sum + ", 최소값: "+min+", 최대값: "+max+", 평균: " + getAverage() + ", 표준편차: " + getStandardDeviation();
    }
}
