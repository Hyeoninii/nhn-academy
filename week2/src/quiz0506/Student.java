package quiz0506;

public class Student {
    private String name;
    private int age;

    //Quiz 5-6 prob 1
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student student = new Student("Alice", 20);
        student.displayInfo(); // Name: Alice, Age: 20 출력
    }

}
