//Quiz 5-1 prob 5
package quiz0501;

public class Prob5 {
    public static void main(String[] args) {
        Book b = new Book("Java Programming", 30000);
        System.out.printf("제목: %s, 가격: %d", b.getTitle(), b.getPrice());
    }
}
