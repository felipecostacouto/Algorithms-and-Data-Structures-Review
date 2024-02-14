package quickSort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSortTest {

         private quickSortAlgo algo;

         @BeforeEach
         public void setUp() {
             algo = new quickSortAlgo();
        }

        @Test
        public void quickSortRandomArray() {
            // Test case with a random array
            int[] arr1 = {5, 2, 9, 1, 5, 6};
            int[] sortedArr1 = {1, 2, 5, 5, 6, 9};
            algo.quickSort(arr1, 0, arr1.length - 1);
            assertArrayEquals(sortedArr1, arr1);
        }

        @Test
        public void quickSortSortedArray() {
            // Test case with an already sorted array
            int[] arr2 = {1, 2, 3, 4, 5};
            int[] sortedArr2 = {1, 2, 3, 4, 5};
            algo.quickSort(arr2, 0, arr2.length - 1);
            assertArrayEquals(sortedArr2, arr2);
        }

        @Test
        public void quickSortDescOrder() {
            // Test case with an array in descending order
            int[] arr3 = {9, 7, 5, 3, 1};
            int[] sortedArr3 = {1, 3, 5, 7, 9};
            algo.quickSort(arr3, 0, arr3.length - 1);
            assertArrayEquals(sortedArr3, arr3);
        }

        @Test
        public void quickSortContainsDup() {
            // Test case with an array containing duplicate values
            int[] arr4 = {4, 2, 4, 1, 2, 3};
            int[] sortedArr4 = {1, 2, 2, 3, 4, 4};
            algo.quickSort(arr4, 0, arr4.length - 1);
            assertArrayEquals(sortedArr4, arr4);
        }

        @Test
        public void quickSortEmptyArray() {
            // Test case with an empty array
            int[] arr5 = {};
            int[] sortedArr5 = {};
            algo.quickSort(arr5, 0, arr5.length - 1);
            assertArrayEquals(sortedArr5, arr5);
        }
        @Test
        public void quickSortSizeOneArray() {
            // Test case with an array of size 1
            int[] arr6 = {42};
            int[] sortedArr6 = {42};
            algo.quickSort(arr6, 0, arr6.length - 1);
            assertArrayEquals(sortedArr6, arr6);
        }

}
