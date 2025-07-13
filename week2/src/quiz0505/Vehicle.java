package quiz0505;

abstract class Vehicle {
    int registrationNumber;
    String owner;

    public Vehicle() {}
    public Vehicle(int registrationNumber, String owner) {
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }
    final void printRegistration() {
        System.out.println("등록 정보: "+this.registrationNumber);
    }
    abstract void drive();
}

class Car extends Vehicle {
    int numberOfDoors;

    public Car() {}

    @Override
    void drive() {
        System.out.println("자동차 운전");
    }

    public Car(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    void printInfo() {
        System.out.println("문의 개수: "+this.numberOfDoors);
    }
}

class Truck extends Vehicle {
    public Truck() {}

    @Override
    void drive() {
        System.out.println("트럭 운전");
    }
}
