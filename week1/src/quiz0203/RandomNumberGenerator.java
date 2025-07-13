package quiz0203;

//Quiz 2-3 prob 6
public class RandomNumberGenerator {
    public static void main(String[] args) {
        //100은 절대 안나옴
        int randomNumber = (int)(Math.random()*100);
        System.out.println("생성된 난수: " + randomNumber);
    }
}
