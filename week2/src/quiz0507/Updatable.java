package quiz0507;

public interface Updatable {
    void update();

    default void reset() {
        System.out.println("Resetting to default state.");
    }
} 