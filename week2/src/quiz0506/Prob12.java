//Quiz 5-6 prob 12
package quiz0506;

class Animal {
    protected String species;

    public Animal(String species) {
        this.species = species;
    }
}

class Bird extends Animal {
    private String color;

    public Bird(String species, String color) {
        super(species);
        this.color = color;
    }

    public void display() {
        System.out.println("Species: " + species + ", Color: " + color);
    }
}


public class Prob12 {
    public static void main(String[] args) {
        Bird bird = new Bird("Parrot", "Green");
        bird.display(); // Species: Parrot, Color: Green 출력
    }

}
