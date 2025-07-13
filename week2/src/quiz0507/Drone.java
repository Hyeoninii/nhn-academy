package quiz0507;

public class Drone implements Hoverable{
    @Override
    public void hover() {
        System.out.println("Drone is hovering");
    }
    @Override
    public void fly() {
        System.out.println("Drone is flying.");
    }
}
