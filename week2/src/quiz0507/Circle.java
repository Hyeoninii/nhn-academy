package quiz0507;

public class Circle implements Drawable{
    private double radius;
    @Override
    public void draw() {
        System.out.println("원을 그린다.");
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
