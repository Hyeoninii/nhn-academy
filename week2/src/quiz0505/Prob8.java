//Quiz 5-5 prob 8
package quiz0505;

import java.util.function.BiFunction;

public class Prob8 {
    public static void main(String[] args) {
        Animal[] arr = new Animal[3];
        arr[0] = new Dog();
        arr[1] = new Cat();
        arr[2] = new Bird();

        for(Animal a : arr) {
            a.makeSound();
        }
    }
}
