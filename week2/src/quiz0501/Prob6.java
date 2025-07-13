package quiz0501;

public class Prob6 {
    public static void main(String[] args) {
        Student st1 = new Student("Alice", 85);
        Student st2 = new Student("Bob", 90);
        Student st3 = new Student("Charlie", 78);

        System.out.printf("이름: %s, 점수: %d%n", st1.name, st1.score);
        System.out.printf("이름: %s, 점수: %d%n", st2.name, st2.score);
        System.out.printf("이름: %s, 점수: %d%n", st3.name, st3.score);
    }
}
