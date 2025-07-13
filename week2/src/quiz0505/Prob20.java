//Quiz 5-5 prob 20
package quiz0505;

public class Prob20 {
    public static void main(String[] args) {
        Animal20[] arr = new Animal20[2];
        arr[0] = new Dog20();
        arr[1] = new Fish20();
        for(Animal20 a : arr) {
            a.eat();
        }
    }
}

abstract class Animal20 {
    abstract void eat();
}

class Dog20 extends Animal20 {
    @Override
    void eat() {System.out.println("개 먹는중");}
}
class Fish20 extends Animal20 {
    @Override
    void eat() {System.out.println("물고기 먹는중");}
}
