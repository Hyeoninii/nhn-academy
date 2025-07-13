//Quiz 5-2 prob 8
package quiz0502;

public class Student {
    static int studentCount;
    String name;

    public Student(String name) {
        this.name = name;
        studentCount++;
    }

    public static void main(String[] args) {
        Student s1 = new Student("S1");
        Student s2 = new Student("S2");
        System.out.println(studentCount);
    }
}
