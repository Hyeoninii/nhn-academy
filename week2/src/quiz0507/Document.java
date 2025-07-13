package quiz0507;

public class Document implements Readable,Writable {
    public void read() {
        System.out.println("Reading the document.");
    }

    @Override
    public void write() {
        System.out.println("Writing to the document.");
    }

    @Override
    public void printType() {
        System.out.println("Document");
    }

    @Override
    public char readChar() {
        return '.';
    }
    @Override
    public String readLine() {
        return "";
    }
}
