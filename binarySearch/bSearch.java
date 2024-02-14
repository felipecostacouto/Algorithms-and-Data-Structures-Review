package binarySearch;

import java.util.*;


//O(log(n))
public class bSearch {
    public int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length -1;
        int middle = 0;
        int current = 0;
        Arrays.sort(arr);

        while(left <= right){
            middle = left +((right - left)/2);
            current = arr[middle];
            if(target == current){
                return middle; // position on array
            }else if(target > current){
                left = middle + 1;
            }else{
                right = middle - 1;
            }
        }
        return -1;
    }
}
