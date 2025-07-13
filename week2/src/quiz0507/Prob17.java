//Quiz 5-7 prob 17
package quiz0507;

public class Prob17 {
    public static void main(String[] args) {
        Task task = new Task();

        task.runTask(() -> System.out.println("Callback executed."));
    }
} 