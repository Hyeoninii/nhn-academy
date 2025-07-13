package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class XArrays {

    static <T> void validateArrayNull(T source) {
        if(source==null) throw new NullPointerException("NULL 예외");
    }

    static <T> void validateArrayLength(int length, int start, int end) {
        if(end > length || start > end || start < 0) {
            throw new IndexOutOfBoundsException("잘못된 인덱스");
        }
    }
    //Quiz 3
    public static int[] copy(int[] source) {
        validateArrayNull(source);
        int[] arrCopy = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            arrCopy[i] = source[i];
        }
        return arrCopy;
    }
    public static <T> T[] copy(T[] source) {
        validateArrayNull(source);
        T[] arrCopy = (T[]) Array.newInstance(source.getClass().getComponentType(), source.length);
        for (int i = 0; i < source.length; i++) {
            arrCopy[i] = source[i];
        }
        return arrCopy;
    }

    //Quiz 4
    public static int[] copy(int[] source, int startIndex, int length) {
        validateArrayNull(source);
        validateArrayLength(source.length, startIndex, length);
        int[] arrCopy = new int[source.length+startIndex-length];
        for (int i = 0; i < arrCopy.length; i++) {
            arrCopy[i] = source[i+startIndex];
        }
        return arrCopy;
    }

    public static <T> T[] copy(T[] source, int startIndex, int length) {
        validateArrayNull(source);
        validateArrayLength(source.length, startIndex, length);
        T[] arrCopy = (T[]) Array.newInstance(source.getClass().getComponentType(), source.length+startIndex-length);
        for (int i = 0; i < arrCopy.length; i++) {
            arrCopy[i] = source[i+startIndex];
        }
        return arrCopy;
    }

    //Quiz 5
    public static void copy(int[] source, int srcIndex, int[] destination, int destIndex, int length) {
        validateArrayNull(source);
        validateArrayNull(destination);
        validateArrayLength(source.length, srcIndex, length);
        validateArrayLength(destination.length, destIndex, length);
        if (source == destination && destIndex > srcIndex && srcIndex + length > destIndex) {
            for (int i = length - 1; i >= 0; i--) {
                destination[destIndex + i] = source[srcIndex + i];
            }
        } else {
                for (int i = 0; i < length; i++) {
                    destination[destIndex + i] = source[srcIndex + i];
                }
            }
        }

    public static <T> void copy(T[] source, int srcIndex, T[] destination, int destIndex, int length) {
        validateArrayNull(source);
        validateArrayNull(destination);
        validateArrayLength(source.length, srcIndex, length);
        validateArrayLength(destination.length, destIndex, length);
        if (source == destination && destIndex > srcIndex && srcIndex + length > destIndex) {
            for (int i = length - 1; i >= 0; i--) {
                destination[destIndex + i] = source[srcIndex + i];
            }
        } else {
            for (int i = 0; i < length; i++) {
                destination[destIndex + i] = source[srcIndex + i];
            }
        }
    }
    //Quiz 6
    public static int[][] deepCopy(int[][] source) {
        validateArrayNull(source);
        int[][] arrCopy = new int[source.length][];
        for (int i = 0; i < source.length; i++) {
            arrCopy[i] = copy(source[i]);
        }
        return arrCopy;
    }
    public static <T> T[][] deepCopy(T[][] source) {
        validateArrayNull(source);
        T[][] arrCopy = (T[][]) Array.newInstance(source.getClass().getComponentType(), source.length);
        for (int i = 0; i < source.length; i++) {
            arrCopy[i] = copy(source[i]);
        }
        return arrCopy;
    }
    public static Object[] deepCopy(Object[] source) {
        validateArrayNull(source);
        Object[] arrCopy = new Object[source.length];
        for (int i = 0; i < source.length; i++) {
            arrCopy[i] = source[i];
        }
        return arrCopy;
    }

    //Quiz 7
    public static boolean equals(int[] array1, int[] array2) {
        validateArrayNull(array1);
        validateArrayNull(array2);
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    public static <T> boolean equals(T[] array1, T[] array2) {
        validateArrayNull(array1);
        validateArrayNull(array2);
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }



    //Quiz 8
    public static boolean equals(int[][] array1, int[][] array2) {
        validateArrayNull(array1);
        validateArrayNull(array2);
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!Arrays.equals(array1[i], array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean equals(T[][] array1, T[][] array2) {
        validateArrayNull(array1);
        validateArrayNull(array2);
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!Arrays.equals(array1[i], array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean equals(Object array1, Object array2) {
        validateArrayNull(array1);
        validateArrayNull(array2);
        if (array1.getClass() != array2.getClass()) {
            return false;
        }
        if (array1 instanceof Object[]) {
            return equals((Object[]) array1, (Object[]) array2);
        } else {
            return Arrays.equals((int[]) array1, (int[]) array2);
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] copied = XArrays.copy(arr);
        System.out.println(Arrays.toString(copied));

    }
}
