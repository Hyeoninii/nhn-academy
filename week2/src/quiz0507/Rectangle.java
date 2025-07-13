package quiz0507;

public class Rectangle implements Drawable{
    private int width;
    private int height;

    public Rectangle() {
        this(1, 1);
    }
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("사각형을 그린다.");
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
