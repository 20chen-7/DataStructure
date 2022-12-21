package Arrays.RadixSort;

public class StableCntingSortAlgori {
    public static void main(String[] args){
        int[] arr = {4725, 4586, 1330, 8792, 1594, 5729};
        radixSort(arr, 10, 4 );
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void radixSort(int[] input, int radix, int width){
        for (int i = 0; i < width; i++){
            radixSingleSort(input, i, radix);
        }
    }
    public static void radixSingleSort(int[] input, int position, int radix){
        int numItems = input.length;
        int[] cntArr = new int[radix];
        for (int value: input){
            cntArr[getDigit(position, value, radix)]++;
        }
        //cnt <= j cntArr
        for (int j = 1; j < radix; j++){
            cntArr[j] += cntArr[j-1]; //add <= j
        }
        int[] tmp = new int[numItems];
        for (int tmpIdx = numItems-1; tmpIdx >= 0; tmpIdx--){
            tmp[--cntArr[getDigit(position, input[tmpIdx], radix)]] = input[tmpIdx];
        }
        for (int tmpidx = 0; tmpidx < numItems; tmpidx++){
            input[tmpidx] = tmp[tmpidx];
        }
    }
    public static int getDigit(int position, int value, int radix){
        return value/(int) Math.pow(radix, position)%radix;
    }
}
