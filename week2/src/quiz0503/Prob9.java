//Quiz 5-3 prob 9
package quiz0503;

public class Prob9 {

    public static void main(String[] args) {
        Student9 s1 = new Student9("Alice", 90);
        Student9 s2 = new Student9("Bob", 80);

        Lecture9 l1 = new Lecture9("CS", new Student9[]{s1, s2});

        System.out.println(l1.name);
        for(int i=0; i<l1.list.length; i++) {
            System.out.println("이름: " + l1.list[i].name + ", 점수: " + l1.list[i].score);
        }
    }
}

class Student9 {
    String name;
    int score;

    public Student9(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Lecture9 {
    String name;
    Student9[] list;

    public Lecture9(String name, Student9[] list) {
        this.name = name;
        this.list = list;
    }
}