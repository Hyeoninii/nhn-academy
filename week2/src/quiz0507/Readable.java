package quiz0507;

public interface Readable {
    char readChar();
    String readLine();

    void read();
    default void printType() {
        System.out.println("I am Readable.");
    }
}
