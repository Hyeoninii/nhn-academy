//Quiz 5-2 prob 7
package quiz0502;

public class Person {
    String name;

    public Person(String name) {
        if(name==null) {
            throw new IllegalArgumentException("NULL 객체");
        }
        this.name = name;
    }

    public static void main(String[] args) {
        Person p = new Person(null);
    }
}
