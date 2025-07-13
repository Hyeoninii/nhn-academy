package quiz0507;

public interface Writable {
    void write();
    default void printType() {
        System.out.println("I am Writable.");
    }
}
