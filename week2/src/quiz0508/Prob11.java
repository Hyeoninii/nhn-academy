//Quiz 5-8 prob 11
package quiz0508;

import java.util.Arrays;
import java.util.Comparator;

public class Prob11 {
    public static void main(String[] args) {
        Integer[] numbers = {3, 1, 4, 1, 5};

        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1); // 내림차순 정렬
            }
        });

        System.out.println(Arrays.toString(numbers)); // [5, 4, 3, 1, 1] 출력
    }
} 