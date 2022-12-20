package Arrays.ShellSort;

public class ShellSortAlgor {
    public static void main(String[] args){
        int[] arrays = {20, 35, -15, 7, 55, 1, -22};
        for (int gap = arrays.length/2; gap > 0; gap = gap/2 ){
            for (int i = gap; i < arrays.length; i++){
                int newElement = arrays[i];
                int j = i;
                while (j >= gap && arrays[j-gap] > newElement){
                    arrays[j] = arrays[j-gap];
                    j -= gap;
                }
                arrays[j] = newElement;
            }
        }
        for (int i = 0; i < arrays.length; i++){
            System.out.println(arrays[i]);
        }
    }
}
