package quiz0507;

public interface Movable {
    void move();

    default void stop() {
        System.out.println("Stopping...");
    }
} 