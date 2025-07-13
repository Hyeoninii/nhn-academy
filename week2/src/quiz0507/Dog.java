package quiz0507;

public class Dog implements Pet {
    @Override
    public void sound() {
        System.out.println("Woof!");
    }

    @Override
    public void play() {
        System.out.println("Playing fetch.");
    }
} 