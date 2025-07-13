//Quiz 5-7 prob 16
package quiz0507;

public class Prob16 {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 90);
        Student s2 = new Student("Bob", 85);

        System.out.println(s1.compareTo(s2)); // 양수, 음수, 또는 0 출력
    }
} 