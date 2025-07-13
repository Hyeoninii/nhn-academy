//Quiz 5-5 prob 15
package quiz0505;

public class Prob15 {
    public static void main(String[] args) {
        Vehicle[] arr = new Vehicle[2];
        arr[0] = new Car();
        arr[1] = new Truck();
        for(Vehicle v : arr) {
            v.drive();
        }
    }
}
