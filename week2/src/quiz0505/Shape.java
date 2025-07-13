package quiz0505;

abstract class Shape implements Comparable<Shape>, Drawable {
    private int size;

    public Shape(int size) {
        this.size = size;
    }
    @Override
    public int compareTo(Shape s) {
        return Integer.compare(this.size, s.size);
    }

    int setSize(int size) { return this.size = size; }
    int getSize() { return this.size; }
    abstract void printInfo();
    abstract double caculateArea();
}

class Rectangle extends Shape {
    public Rectangle() {
        super(1);
    }
    public Rectangle(int size) {
        super(size);
    }
    @Override
    public void draw() {
        System.out.println("사각형을 그린다.");
    }

    @Override
    void printInfo() {
        System.out.println("사각형, 사이즈: "+getSize());
    }

    @Override
    double caculateArea() {
        return getSize() * getSize();
    }
}

class Circle extends Shape {

    public Circle() {
        super(1);
    }
    public Circle(int size) {
        super(size);
    }

    @Override
    public void draw() {
        System.out.println("원을 그린다.");
    }

    @Override
    void printInfo() {
        System.out.println("원, 사이즈: "+getSize());
    }
    @Override
    double caculateArea() {
        return Math.PI * getSize() * getSize();
    }
}

class Oval extends Shape {
    public Oval() {
        super(1);
    }
    public Oval(int size) {
        super(size);
    }
    @Override
    public void draw() {
        System.out.println("타원을 그린다.");
    }
    @Override
    void printInfo() {
        System.out.println("타원, 사이즈: "+getSize());
    }
    @Override
    double caculateArea() {
        return Math.PI * getSize() * getSize() / 4;
    }
}

class Triangle extends Shape {

    public Triangle() {
        super(1);
    }
    public Triangle(int size) {
        super(size);
    }

    @Override
    public void draw() { System.out.println("삼각형을 그린다.");}

    @Override
    void printInfo() {
        System.out.println("삼각형, 사이즈: "+getSize());
    }
    @Override
    double caculateArea() {
        return (double) (getSize() * getSize()) / 2;
    }

}
