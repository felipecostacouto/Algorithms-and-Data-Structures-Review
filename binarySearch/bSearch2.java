package binarySearch;

import java.util.Arrays;

public class bSearch2 {

    public int binarySearch2(int[] s, int x){
        int l = 0;
        int r = s.length - 1;
        Arrays.sort(s);

        while( l <= r){
            int mid = l + ((r - l)/2);
            if(s[mid] == x){
                return mid;
            }else {
                if (s[mid] < x) {
                    l = mid +1;
                } else {
                   r = mid -1;
                }
            }
        }
        return -1;
    }
}
