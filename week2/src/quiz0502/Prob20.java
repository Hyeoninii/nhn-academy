//Quiz 5-2 prob 20
package quiz0502;

class Library {
    static int totalBooks;
    public Library() {
        totalBooks ++;
    }
}

public class Prob20 {
    public static void main(String[] args) {
        Library library1 = new Library();
        Library library2 = new Library();
        Library library3 = new Library();
        System.out.println(library1.totalBooks);
    }
}
