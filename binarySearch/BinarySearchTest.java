package binarySearch;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Before;

public class BinarySearchTest {
    private bSearch b;

    @Before
    public void setUp() {
        b = new bSearch();
    }

    @Test
    public void testBinarySearchExistsInMiddle() {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
        int result = b.binarySearch(arr, 11);
        assertEquals(5, result);
    }

    @Test
    public void testBinarySearchExistsAtBeginning() {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
        int result = b.binarySearch(arr, 1);
        assertEquals(0, result);
    }

    @Test
    public void testBinarySearchExistsAtEnd() {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
        int result = b.binarySearch(arr, 21);
        assertEquals(10, result);
    }

    @Test
    public void testBinarySearchNotExists() {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
        int result = b.binarySearch(arr, 6);
        assertEquals(-1, result);
    }

    @Test
    public void testBinarySearchExistsInMiddle2() {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
        int result = b.binarySearch(arr, 9);
        assertEquals(4, result);
    }

    @Test
    public void testBinarySearchExistsInMiddle3() {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
        int result = b.binarySearch(arr, 19);
        assertEquals(9, result);
    }

    @Test
    public void testLargeArr1() {
        int[] largeArr = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            largeArr[i] = i;
        }
        int result = b.binarySearch(largeArr, 999999);
        assertEquals(999999, result);
    }

    @Test
    public void testLargeArr2() {
        int[] largeArr = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            largeArr[i] = i;
        }
        int result = b.binarySearch(largeArr, 1000000);
        assertEquals(-1, result);
    }

    @Test
    public void testPerformance() {
        int[] largeArr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            largeArr[i] = i;
        }
        long startTime = System.currentTimeMillis();
        int result = b.binarySearch(largeArr,999);
        long endTime = System.currentTimeMillis();

        assertTrue(endTime - startTime < 5); //large array of 1,000,000 elements completes in under 5 millisecond (1000 microseconds)
    }


}
