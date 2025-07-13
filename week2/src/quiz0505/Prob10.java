//Quiz 5-5 prob 10
package quiz0505;

public class Prob10 {
     public static void main(String[] args) {
         Vehicle[] arr = new Vehicle[2];
         arr[0] = new Car();
         arr[1] = new Truck();

         arr[0].drive();
         arr[1].drive();
     }
}
