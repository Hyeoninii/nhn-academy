//Quiz 4-3 Prob 3
package quiz0403;

public class MakeRow {
    public static String printRow(char ch, int N) {
        return Character.toString(ch).repeat(N);
    }
    public static void main(String[] args) {
        System.out.println(printRow('*', 5));
        System.out.println(printRow('#', 0));
        System.out.println(printRow('!', 8));

    }
}
