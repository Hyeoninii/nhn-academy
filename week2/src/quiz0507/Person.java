package quiz0507;

public class Person implements Walkable, Runnable{
    @Override
    public void walk() {
        System.out.println("걷는 중");
    }
    public void run() {
        System.out.println("뛰는 중");
    }
}
