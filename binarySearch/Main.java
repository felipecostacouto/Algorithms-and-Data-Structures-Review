package binarySearch;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        bSearch2 b = new bSearch2();
        int[] arr = { 2, 3, 4, 10, 40, 7, 22};
        int x = 22;
        int result = b.binarySearch2(arr, x);
        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else {
            Arrays.sort(arr);
            for (int y : arr) {
                System.out.print(" " + y);
            }
            System.out.println("\nElement is present at "
                    + "index: " + result);
        }
    }
}
