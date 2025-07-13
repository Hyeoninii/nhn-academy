//Quiz 5-1 prob 8
package quiz0501;

public class Car {
    int speed;
    void accelerate() {
        speed += 10;
    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("초기 속도: " + car.speed);
        car.accelerate();
        System.out.println("가속 후 속도: " + car.speed);

    }
}
