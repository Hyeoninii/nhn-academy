//quiz 4-2 prob 5
package quiz0402;

public class Prob5 {
    public static void main(String[] args) {
        checkNumber(10);
        checkNumber(-10);
        checkNumber(0);
    }
    static void checkNumber(int n) {
        if(n>0) {
            System.out.println(n + "은 양수");
        } else if(n<0) {
            System.out.println(n + "은 음수");
        } else {
            System.out.println(n + "은 0");
        }
    }
}
