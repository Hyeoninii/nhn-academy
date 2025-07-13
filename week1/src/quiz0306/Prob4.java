//Quiz 3-6 prob 4
package quiz0306;

import java.util.Scanner;

public class Prob4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("자동차 번호 4자리를 입력하세요: ");
        int carNumber = sc.nextInt();
        String carType;
        if(carNumber>9999 || carNumber<1000){
            carType = "유효하지 않은 입력입니다.";
        }else{
        switch(carNumber/1000){
            case 1: carType = "승용차";
            break;
            case 2: carType = "승합차";
            break;
            case 3: carType = "화물차";
            break;
            case 4: carType = "특수차";
            break;
            default: carType = "유효하지 않은 입력입니다.";
            break;
        }}
        System.out.println(carType);
        sc.close();
    }
} 