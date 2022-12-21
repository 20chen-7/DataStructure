package Arrays.QuickSort;

public class QuickSortAlgor {
    public static void main(String[] args){
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        quickSort(arr, 0, arr.length);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void quickSort(int[] input, int start, int end){
        if (end-start<2){
            return;
        }
        int pivotIdx = partition(input, start, end);
        quickSort(input, start, pivotIdx);
        quickSort(input, pivotIdx+1, end);
    }
    public static int partition(int[] input, int start, int end){
        //first element
        int pivot = input[start];
        int i = start;
        int j = end;
        while (i < j) {
            while (i < j && input[--j] >= pivot) ; //empty loop body,
            if (i < j) {
                input[i] = input[j];
            }
            while (i < j && input[++i] <= pivot) ; //empty loop body
            if (i < j) {
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;  //return i also work, as i == j
    }
}
