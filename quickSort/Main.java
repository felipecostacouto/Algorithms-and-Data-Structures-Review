package quickSort;

public class Main {

    public static void main(String[] args){
        quickSortAlgo algo = new quickSortAlgo();
        int[] array = {8,2,5,3,9,4,7,6,1};

        algo.quickSort(array, 0, array.length -1);

        for(int i: array){
            System.out.print(i + " ");
        }
    }
}
