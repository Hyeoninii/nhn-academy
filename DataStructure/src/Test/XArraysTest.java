package Test;

import Array.XArrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class XArraysTest {

    // copy(int[] source) 테스트
    @Test
    void testCopyIntArray() {
        int[] source = { 1, 2, 3, 4, 5 };
        int[] destination = XArrays.copy(source);
        assertArrayEquals(source, destination);
    }

    @Test
    void testCopyIntArray_NullSource() {
        assertThrows(NullPointerException.class, () -> XArrays.copy((int[]) null));
    }

    // copy(T[] source) 테스트
    @Test
    void testCopyGenericArray() {
        String[] source = { "a", "b", "c" };
        String[] destination = XArrays.copy(source);
        assertArrayEquals(source, destination);
    }

    @Test
    void testCopyGenericArray_NullSource() {
        assertThrows(NullPointerException.class, () -> XArrays.copy((String[]) null));
    }

    // copy(int[] source, int startIndex, int length) 테스트
    @Test
    void testCopyIntArrayWithStartAndLength() {
        int[] source = { 1, 2, 3, 4, 5 };
        int[] destination = XArrays.copy(source, 1, 3);
        assertArrayEquals(new int[] { 2, 3, 4 }, destination);
    }

    @Test
    void testCopyIntArrayWithStartAndLength_NullSource() {
        assertThrows(NullPointerException.class, () -> XArrays.copy((int[]) null, 0, 0));
    }

    @Test
    void testCopyIntArrayWithStartAndLength_InvalidParams() {
        int[] source = { 1, 2, 3, 4, 5 };
        assertThrows(IndexOutOfBoundsException.class, () -> XArrays.copy(source, -1, 3));
        assertThrows(IndexOutOfBoundsException.class, () -> XArrays.copy(source, 2, 10));
    }

    // copy(T[] source, int startIndex, int length) 테스트
    @Test
    void testCopyGenericArrayWithStartAndLength() {
        String[] source = { "a", "b", "c", "d", "e" };
        String[] destination = XArrays.copy(source, 1, 3);
        assertArrayEquals(new String[] { "b", "c", "d" }, destination);
    }

    @Test
    void testCopyGenericArrayWithStartAndLength_NullSource() {
        assertThrows(NullPointerException.class, () -> XArrays.copy((String[]) null, 0, 0));
    }

    @Test
    void testCopyGenericArrayWithStartAndLength_InvalidParams() {
        String[] source = {"a", "b", "c", "d", "e"};
        assertThrows(IndexOutOfBoundsException.class, () -> XArrays.copy(source, -1, 3));
        assertThrows(IndexOutOfBoundsException.class, () -> XArrays.copy(source, 2, 10));
    }
        // copy(int[] source, int srcIndex, int[] destination, int destIndex, int
        // length) 테스트
        @Test
        void testCopyIntArrayToAnotherArray() {
            int[] source = { 1, 2, 3, 4, 5 };
            int[] destination = new int[5];
            XArrays.copy(source, 1, destination, 2, 3);
            assertArrayEquals(new int[] { 0, 0, 2, 3, 4 }, destination);
        }

        @Test
        void testCopyIntArrayToSelf() {
            int[] source = { 1, 2, 3, 4, 5 };
            XArrays.copy(source, 1, source, 2, 3);
            assertArrayEquals(new int[] { 1, 2, 2, 3, 4 }, source);

            XArrays.copy(source, 2, source, 0, 3);
            assertArrayEquals(new int[] { 2, 3, 4, 3, 4 }, source);
        }

        @Test
        void testCopyIntArrayToAnotherArray_NullSourceOrDestination() {
            int[] source = { 1, 2, 3, 4, 5 };
            int[] destination = new int[5];
            assertThrows(NullPointerException.class, () -> XArrays.copy((int[]) null, 0, destination, 0, 0));
            assertThrows(NullPointerException.class, () -> XArrays.copy(source, 0, (int[]) null, 0, 0));
        }

        @Test
        void testCopyIntArrayToAnotherArray_InvalidParams() {
            int[] source = { 1, 2, 3, 4, 5 };
            int[] destination = new int[5];
            assertThrows(IndexOutOfBoundsException.class, () -> XArrays.copy(source, -1, destination, 0, 3));
            assertThrows(IndexOutOfBoundsException.class, () -> XArrays.copy(source, 0, destination, -1, 3));
            assertThrows(IndexOutOfBoundsException.class, () -> XArrays.copy(source, 2, destination, 1, 10));
        }

        // copy(T[] source, int srcIndex, T[] destination, int destIndex, int length)
        // 테스트
        @Test
        void testCopyGenericArrayToAnotherArray() {
            String[] source = { "a", "b", "c", "d", "e" };
            String[] destination = new String[5];
            XArrays.copy(source, 1, destination, 2, 3);
            assertArrayEquals(new String[] { null, null, "b", "c", "d" }, destination);
        }

        @Test
        void testCopyGenericArrayToSelf() {
            String[] source = { "a", "b", "c", "d", "e" };
            XArrays.copy(source, 1, source, 2, 3);
            assertArrayEquals(new String[] { "a", "b", "b", "c", "d" }, source);

            XArrays.copy(source, 2, source, 0, 3);
            assertArrayEquals(new String[] { "b", "c", "d", "c", "d" }, source);
        }

        @Test
        void testCopyGenericArrayToAnotherArray_NullSourceOrDestination() {
            String[] source = { "a", "b", "c", "d", "e" };
            String[] destination = new String[5];
            assertThrows(NullPointerException.class, () -> XArrays.copy((String[]) null, 0, destination, 0, 0));
            assertThrows(NullPointerException.class, () -> XArrays.copy(source, 0, (String[]) null, 0, 0));
        }

        @Test
        void testCopyGenericArrayToAnotherArray_InvalidParams() {
            String[] source = { "a", "b", "c", "d", "e" };
            String[] destination = new String[5];
            assertThrows(IndexOutOfBoundsException.class, () -> XArrays.copy(source, -1, destination, 0, 3));
            assertThrows(IndexOutOfBoundsException.class, () -> XArrays.copy(source, 0, destination, -1, 3));
            assertThrows(IndexOutOfBoundsException.class, () -> XArrays.copy(source, 2, destination, 1, 10));
        }

        @Test
        void testIntArrayCompareEquality_NullPoint() {
            int[][] arr1 = null;
            int[][] arr2 = {
                    {1,2,3},
                    null
            };
            assertThrows(NullPointerException.class, () -> XArrays.equals(arr1, arr2));
        }

        @Test
        void testGenericArrayCompareEquality_NullPoint() {
            String[][] arr1 = null;
            String[][] arr2 = {
                    {"a","b","c"},
                    null
            };
            assertThrows(NullPointerException.class, () -> XArrays.equals(arr1, arr2));
        }

    @Test
    void testDeepCopyInt2DArray() {
        int[][] source = {
                {1, 2},
                {3, 4}
        };
        int[][] copy = XArrays.deepCopy(source);

        assertArrayEquals(source, copy); // 값은 같음
        assertNotSame(source, copy);     // 주소는 다름
        assertNotSame(source[0], copy[0]);
        assertNotSame(source[1], copy[1]);
    }

    @Test
    void testDeepCopyGeneric2DArray() {
        String[][] source = {
                {"a", "b"},
                {"c", "d"}
        };
        String[][] copy = XArrays.deepCopy(source);

        assertArrayEquals(source, copy);
        assertNotSame(source, copy);
        assertNotSame(source[0], copy[0]);
        assertNotSame(source[1], copy[1]);
    }

    @Test
    void testDeepCopyObjectArray() {
        Object[] source = { "x", 123, new int[]{1, 2} };
        Object[] copy = XArrays.deepCopy(source);

        assertArrayEquals(source, copy);
        assertNotSame(source, copy);
        assertSame(source[2], copy[2]); // 얕은 복사인 경우, 내부 객체는 같음
    }

    @Test
    void testDeepCopy_NullInput() {
        assertThrows(NullPointerException.class, () -> XArrays.deepCopy((int[][]) null));
        assertThrows(NullPointerException.class, () -> XArrays.deepCopy((String[][]) null));
        assertThrows(NullPointerException.class, () -> XArrays.deepCopy((Object[]) null));
    }
}

