//Quiz 5-1 prob 17
package quiz0501;

public class Product {
    String name;
    int price;
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1200);
        Product p2 = new Product("Phone", 800);
        System.out.println("제품: "+p1.name+", 가격: "+p1.price);
        System.out.println("제품: "+p2.name+", 가격: "+p2.price);
    }
}
