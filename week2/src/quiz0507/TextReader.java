package quiz0507;

import java.util.Scanner;

public class TextReader implements Readable {
    Scanner sc = new Scanner(System.in);
    @Override
    public char readChar() {
        return sc.next().charAt(0);
    }
    @Override
    public String readLine() {
        return sc.nextLine();
    }

    @Override
    public void read() {}
}
