package Arrays.InsertionSort;

public class InsertionSortAlgor {
    public static void main(String[] args){
        int[] arrays = {20, 35, -15, 7, 55, 1, -22};
        //iterative
//        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arrays.length; firstUnsortedIndex++){
//            int newElement = arrays[firstUnsortedIndex];
//            int i;
//            for (i = firstUnsortedIndex; i > 0 && arrays[i-1] >newElement; i-- ){
//                arrays[i] = arrays[i-1];
//            }
//            arrays[i] = newElement;
//        }
        recurInsert(arrays, arrays.length);
        for (int i = 0; i < arrays.length; i++){
            System.out.println(arrays[i]);
        }
    }
    //recursion
    public static void recurInsert(int[] input, int numItems){
        if (numItems < 2){
            return;
        }
        recurInsert(input, numItems-1);
        int i;
        int newElement = input[numItems-1];
        for (i = numItems-1; i > 0 && input[i-1] > newElement; i--){
            input[i] = input[i-1];
        }
        input[i] = newElement;
    }
}
