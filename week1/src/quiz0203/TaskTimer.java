package quiz0203;

//Quiz 2-3 prob 10
public class TaskTimer {
    public static void main(String[] args) {
        long start = System.nanoTime();

        //Task level
        int count = 100;

        for(int i=0; i<count; i++) {}
        
        long end = System.nanoTime();
        long duration = end-start;
        System.out.println("작업 소요 시간(초): " + duration/1_000_000.0);
    }
}
