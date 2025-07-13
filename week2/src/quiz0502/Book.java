//Quiz 5-2 prob 2
package quiz0502;

public class Book {
    String title;
    double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public static void main(String[] args) {
        Book b1 = new Book("test", 2);
        System.out.println(b1.title + " " + b1.price);
    }
}
