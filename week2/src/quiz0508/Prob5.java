//Quiz 5-8 prob 5
package quiz0508;

public class Prob5 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in a thread");
            }
        });
        thread.start();
    }
} 