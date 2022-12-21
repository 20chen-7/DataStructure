package Arrays.CountingSort;

public class CountingSortAlgor {
    public static void main(String[] args){
        int[] arr = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
        countingSort(arr, 0, arr.length);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void countingSort(int[] input, int min, int max){
        int[] cntArr = new int[(max - min) + 1];
        for (int i = min; i < input.length; i++){
            cntArr[input[i]-min]++;
        }
        int j = 0;
        for (int i = min; i <= max; i++){
            while (cntArr[i-min] > 0){
                input[j++] = i;
                cntArr[i-min]--;
            }
        }
    }
}
