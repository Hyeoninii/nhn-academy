//Quiz 5-2 prob 15
package quiz0502;

public class Classroom {
    String[] students;

    public Classroom(String[] students) {
        this.students = students;
    }

    void print() {
        for(int i = 0; i < students.length; i++) {
            System.out.print(students[i]+ " ");
        }
    }

    public static void main(String[] args) {
        String[] strArr = {"Alice", "Bob", "Charlie"};
        Classroom cr = new Classroom(strArr);
        cr.print();

    }
}
