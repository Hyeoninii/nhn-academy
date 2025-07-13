//Quiz 4-3 prob 5
package quiz0403;

public class ArrayPrinter {
    public static void arrayPrinter(int[] list) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=0; i<list.length; i++) {
            sb.append(list[i]).append(", ");
        }
        if(!sb.isEmpty()) {sb.setLength(sb.length()-2);}
        sb.append("]");
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        arrayPrinter(numbers);
    }
}
