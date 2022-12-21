package Arrays.MergeSort;

public class MergeSort {
    public static void main(String[] args){
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        mergeSort(arr, 0, arr.length);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void mergeSort(int[] input, int start, int end){
        if (end - start < 2){
            return;
        }
        int mid = (start+end)/2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
//        merge(input, start, mid, end);
        reverseMerge(input, start, mid, end);
    }
    public static void reverseMerge(int[] input, int start, int mid, int end){
        if (input[mid-1] >= input[mid]){
            return;
        }
        int i = start;
        int j = mid;
        int tmpIdx = 0;
        int[] tmp = new int[end-start];
        while (i < mid && j < end){
            tmp[tmpIdx++] = input[i] >= input[j] ? input[i++]:input[j++]; //equal ensure stable
        }
        System.arraycopy(input, i, input,start+tmpIdx, mid-i);//if right half has one largest value ,
        // pyt it on the start+tmpidx, else do not change anything if left largest is the last one
        System.arraycopy(tmp, 0, input, start, tmpIdx);

//    public static void merge(int[] input, int start, int mid, int end){
//        if (input[mid-1] <= input[mid]){
//            return;
//        }
//        int i = start;
//        int j = mid;
//        int tmpIdx = 0;
//        int[] tmp = new int[end-start];
//        while (i < mid && j < end){
//            tmp[tmpIdx++] = input[i] <= input[j] ? input[i++]:input[j++]; //equal ensure stable
//        }
//        System.arraycopy(input, i, input,start+tmpIdx, mid-i);//if right half has one largest value ,
//        // pyt it on the start+tmpidx, else do not change anything if left largest is the last one
//        System.arraycopy(tmp, 0, input, start, tmpIdx);

    }
}
