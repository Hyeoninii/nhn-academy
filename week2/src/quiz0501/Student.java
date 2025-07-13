//Quiz 5-1 prob 3, 6
package quiz0501;

public class Student {
    String name;
    int score;
    public Student() {
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public static void main(String[] args) {
        Student st = new Student("Alice", 88);
        System.out.printf("이름: %s, 점수: %d", st.name, st.score);
    }
}
