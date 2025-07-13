package quiz0207;

//Quiz 2-7 prob 2
public class Prob2 {
    public static void main(String[] args) {
        int a = (int)(Math.random()*6)+1;
        int b = (int)(Math.random()*6)+1;

        System.out.println("첫 번째 주사위 결과: " + a);
        System.out.println("두 번째 주사위 결과: " + b);
        System.out.println("총합: " + (a+b));
    }
}
