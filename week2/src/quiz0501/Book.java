//Quiz 5-1 prob 5
package quiz0501;

public class Book {
    private String title;
    private int price;

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public int getPrice() {
        return price;
    }
}


