package quickSort;

public class quickSortAlgo {
    //left and right are indexes of the array
    public void quickSort(int[] arr, int left, int right){
        if(right <= left){
            return;
        }

        int pivot = partition(arr,left,right);
        quickSort(arr,left, pivot -1);
        quickSort(arr, pivot + 1, right);

    }

    public static int partition(int[] arr, int left, int right){

        int pivot = arr[right]; // pick pivot point
        int i = left -1;
        for(int j = left; j <= right - 1;j++){
            if(arr[j] < pivot){
                i++;
                swap(arr,i,j);
            }
        }
        i++;
        swap(arr,i,right);
        return i; // location of the pivot
    }

    public static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

}
