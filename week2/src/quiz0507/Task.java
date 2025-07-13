package quiz0507;

public class Task {
    public void runTask(Callback callback) {
        System.out.println("Task started.");
        callback.execute();
        System.out.println("Task completed.");
    }
} 