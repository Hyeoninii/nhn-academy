//Quiz 5-2 prob 1
package quiz0502;

public class Car {
    int speed;

    public Car() {
        this.speed = 0;
    }

    public void printSpeed() {
        System.out.println(speed);
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.printSpeed();
    }
}
