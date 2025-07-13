package quiz0510;

public class Prob13_14 {
    public static void main(String[] args) {
        Counter headCounter, tailCounter;
        tailCounter = new Counter();
        headCounter = new Counter();

        for(int flip=0; flip<100; flip++) {
            if(Math.random() < 0.5) {
                headCounter.increment();
            } else {
                tailCounter.increment();
            }
        }
        System.out.println("앞면이 나온 횟수: " + headCounter.getValue() + "회");

        System.out.println("뒷면이 나온 횟수: " + tailCounter.getValue() + "회");

    }
}

class Counter {
    int count;

    int getValue() {
        return this.count;
    }

    void increment() {
        this.count++;
    }
}
