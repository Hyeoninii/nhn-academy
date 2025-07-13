//Quiz 4-3 prob 4
package quiz0403;

public class PrintRowsFromString {
    public static void printRowsFromString(String line, int n) {
        String[] strArr = line.split("");
        for (String s : strArr) {
            System.out.println(s.repeat(n));
        }
    }
    public static void main(String[] args) {
        int n = 25;
        String input = "java";
        printRowsFromString(input, n);
    }
}
