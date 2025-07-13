package quiz0507;

public class Car implements Constants, Movable {

    public void displaySpeedRange() {
        System.out.println("Speed range: " + MIN_SPEED + " - " + MAX_SPEED);
    }
    @Override
    public void move() {
        System.out.println("Car is moving.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }

    
}
