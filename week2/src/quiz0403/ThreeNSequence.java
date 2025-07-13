//Quiz 4-3 prob 1
package quiz0403;

public class ThreeNSequence {
    static int count;
    public static int print3NSequence(int startingValue) {
            while(startingValue != 1) {
                count++;
                System.out.println(startingValue);
                if(startingValue%2 == 0) {
                    startingValue = startingValue/2;
                } else {
                    startingValue = startingValue*3+1;
                }
             }
             if(startingValue==1) {
                System.out.println(1);
                count++;
             }

        return count;
    }

    public static void main(String[] args) {
        int startingValue = 7;
        int sequenceLength = print3NSequence(startingValue);
        System.out.println("시퀀스에는 "+sequenceLength+"개의 항이 포함되어 있습니다.");
        System.out.println("시퀀스 길이: " + sequenceLength);
    }
}