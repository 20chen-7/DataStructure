package Arrays.InsertionSort;

public class InsertionSortAlgor {
    public static void main(String[] args){
        int[] arrays = {20, 35, -15, 7, 55, 1, -22};
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arrays.length; firstUnsortedIndex++){
            int newElement = arrays[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && arrays[i-1] >newElement; i-- ){
                arrays[i] = arrays[i-1];
            }
            arrays[i] = newElement;
        }
        for (int i = 0; i < arrays.length; i++){
            System.out.println(arrays[i]);
        }
    }
}
