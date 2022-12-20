package Arrays.SelectionSort;

public class SelectionSortAlgor {
    public static void main(String[] args){
        int[] arrays = {20, 35, -15, 7, 55, 1, 22};
        for (int lastUnsortedIndex = arrays.length; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++){
                if (arrays[i] > arrays[largest]){
                    largest = i;
                }
            }
            swap(arrays, largest, lastUnsortedIndex);
        }
    }
    public static void swap(int[] arrays, int i, int j){
        int temp = arrays[i];
        arrays[i] = arrays[j];
        arrays[j] = arrays[i];
    }
}
