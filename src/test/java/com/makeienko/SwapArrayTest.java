package test.java.com.makeienko;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SwapArrayTest {

    void swap(int[] array, int index1, int index2) {
        if (array == null ||
                index1 < 0 || index2 < 0 ||
                index1 > array.length - 1 || index2 > array.length - 1) {
            return;
        }
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    @Test
    public void testValidSwap() {
        int[] array = {1, 2, 3, 4};
        swap(array, 1, 3);
        assertArrayEquals(new int[]{1, 4, 3, 2}, array);
    }

    @Test
    public void testOutOfBoundIndex() {
        int[] array = {1, 2, 3, 4};
        swap(array, 1, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4}, array);
    }

    @Test
    public void testNullArray() {
        int[] array = null;
        swap(array, 1, 4);
    }

    @Test
    public void testSameIndex() {
        int[] array = {1, 2, 3, 4};
        swap(array, 4, 4);
        assertArrayEquals(new int[]{1, 2, 3, 4}, array);
    }

    @Test
    public void testNegativeIndex() {
        int[] array = {1, 2, 3, 4};
        swap(array, -1, 4);
        assertArrayEquals(new int[]{1, 2, 3, 4}, array);
    }
}
