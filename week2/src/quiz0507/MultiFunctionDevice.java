package quiz0507;

public class MultiFunctionDevice implements Printer, Scanner {
    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }

    @Override
    public String scan() {
        return "Scanning...";
    }
}
