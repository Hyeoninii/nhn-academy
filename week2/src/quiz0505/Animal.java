package quiz0505;

abstract class Animal {
    String name;
    void makeSound() {}
    abstract void move();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("멍멍");
    }
    @Override
    void move() {
        System.out.println("개 무빙");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("야옹");
    }

    @Override
    void move() {
        System.out.println("고양이 무빙");
    }
}

class Bird extends Animal {
    @Override
    void makeSound() { System.out.println("꽥"); }
    void move() {
        System.out.println("새 무빙");
    }
}

class Fish extends Animal {
    @Override
    void move() {
        System.out.println("물고기 무빙");
    }
}