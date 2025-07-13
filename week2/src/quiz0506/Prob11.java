//Quiz 5-6 prob 11
package quiz0506;

class Manager {
    public void manage(Employee11 employee) {
        System.out.println("Managing: " + employee.getName());
    }
}

class Employee11 {
    private String name;

    public Employee11(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void startWork(Manager manager) {
        manager.manage(this);
    }
}


public class Prob11 {
    public static void main(String[] args) {
        Employee11 emp = new Employee11("John");
        Manager mgr = new Manager();
        emp.startWork(mgr);
    }
}

