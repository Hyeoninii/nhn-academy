//Quiz 3-3 prob 16
package quiz0303;

import java.lang.Math;

public class Prob16 {
    public static void main(String[] args) {
        
        int winRate = 30;
        int currentMoney = 100;
        while(currentMoney>0) {
            int n = (int)(Math.random()*100);

            if(winRate>n) {
                currentMoney += 10;
            } else {
                currentMoney -= 10;
            }
            System.out.println("현재 금액: " + currentMoney + "원");
        } 
    }
}
