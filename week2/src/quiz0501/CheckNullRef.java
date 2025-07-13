//Quiz 5-1 prob 4
package quiz0501;

public class CheckNullRef {
    Person person;

    public static void main(String[] args) {
        CheckNullRef ref = new CheckNullRef();

        if(ref.person == null) {
            System.out.println("Person 객체가 null 입니다.");
            return;
        }
        System.out.println(ref.person.name);
    }
}