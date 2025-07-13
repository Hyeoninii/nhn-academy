//Quiz 5-6 prob 5
package quiz0506;

public class Prob5 {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", "HR");
        emp.display();
    }

}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    private String department;

    public Employee(String name, String department) {
        super(name);
        this.department = department;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}
