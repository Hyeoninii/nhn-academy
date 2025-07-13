//Quiz 3-6 prob 6
package quiz0306;

import java.util.Scanner;

public class Prob6 {
    enum Day {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요일을 입력하세요(예: MONDAY): ");
        String day = sc.nextLine();
        Day dayEnum = Day.valueOf(day);
        switch(dayEnum){
            case SUNDAY:
            case SATURDAY:
                System.out.println("주말입니다.");
                break;
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("주중입니다.");
                break;
            default:
                System.out.println("유효하지 않은 입력입니다.");
                break;
        }
        
        sc.close();
    }
} 