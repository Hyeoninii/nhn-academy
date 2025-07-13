//Quiz 5-8 prob 15
package quiz0508;

public class Prob15 {
    public static void main(String[] args) {
        Comparable<String> comparator = new Comparable<>() {
            @Override
            public int compareTo(String other) {
                return "Hello".compareTo(other); // "Hello"와 비교
            }
        };

        System.out.println(comparator.compareTo("Hello")); // "0" 또는 비교 결과
    }
} 