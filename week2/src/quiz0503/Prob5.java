//Quiz 5-3 prob 5
package quiz0503;

public class Prob5 {

    public static void main(String[] args) {
        Person5 p1 = new Person5("Alice", 20);
        Person5 p2 = new Person5("Alice", 20);
        Person5 p3 = new Person5("Bob", 20);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
    }
}

class Person5 {
    String name;
    int  age;

    public Person5(String name, int age) {
        this.name = name;
        this.age = age;
    }

    boolean equals(Person5 p) {
        return this.name.equals(p.name) && this.age == p.age;
    }
}