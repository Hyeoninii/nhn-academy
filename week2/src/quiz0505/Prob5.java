//Quiz 5-5 prob 5
package quiz0505;

public class Prob5 {
    public static void main(String[] args) {
        Vehicle[] arr = new Vehicle[2];
        arr[0] = new Car();
        arr[1] = new Truck();

        System.out.println(arr[0].getClass());
        System.out.println(arr[1].getClass());

    }
}
