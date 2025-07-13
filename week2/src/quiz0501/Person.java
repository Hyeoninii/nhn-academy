//Quiz 5-1 prob 9
package quiz0501;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Bob");
        Person person2 = person1;
        System.out.println("Person 1 Name: " + person1.name);
        System.out.println("Person 2 Name: " + person2.name);
    }
}
