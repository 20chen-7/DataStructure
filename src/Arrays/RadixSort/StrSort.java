package Arrays.RadixSort;

public class StrSort {
    public static void main(String[] args) {
        String[] strs = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        radixStrSort(strs, 26, 5);
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }

    public static void radixStrSort(String[] input, int radix, int width) {
        for (int i = width-1; i >= 0; i--) {
            radixSingleStrSort(input, i, radix);
        }
    }

    public static void radixSingleStrSort(String[] input, int position, int radix) {
        int numItems = input.length;
        int[] cntArr = new int[radix];
        for (String value : input) {
            cntArr[getIndex(position, value)]++;
        }
        //cnt <= j cntArr
        for (int j = 1; j < radix; j++) {
            cntArr[j] += cntArr[j - 1]; //add <= j
        }
        String[] tmp = new String[numItems];
        for (int tmpIdx = numItems - 1; tmpIdx >= 0; tmpIdx--) {
            tmp[--cntArr[getIndex(position, input[tmpIdx])]] = input[tmpIdx];
        }
        for (int tmpidx = 0; tmpidx < numItems; tmpidx++) {
            input[tmpidx] = tmp[tmpidx];
        }
    }

    public static int getIndex(int position, String value) {
        return value.charAt(position) - 'a';
    }
}