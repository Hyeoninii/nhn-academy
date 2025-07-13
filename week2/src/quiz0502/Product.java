//Quiz 5-2 prob 12
package quiz0502;

public class Product {
    static int totalProducts;
    String name;

    public Product(String name) {
        this.name = name;
        totalProducts++;
    }

    public static void main(String[] args) {
        Product p1 = new Product("P1");
        Product p2 = new Product("P2");
        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(totalProducts);
    }
}
