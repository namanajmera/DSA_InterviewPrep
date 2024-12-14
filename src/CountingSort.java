import commonFunctions.CommonFunctions;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        int[] arr = CommonFunctions.create1DArray(size);
        int[] result = countingSort(arr, size);
        CommonFunctions.print1DArray(result);
    }

    private static int[] countingSort(int[] arr, int size) {
        int[] outputArray = new int[size];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            max = Math.max(max, arr[i]);
        }
        int[] countArray = new int[max + 1];
        Arrays.fill(countArray, 0);
        for (int i = 0; i < arr.length; i++) {
            countArray[arr[i]] += 1;
        }
        for (int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i - 1];
        }
        for (int i = size - 1; i >= 0; i--) {
            outputArray[countArray[arr[i]] - 1] = arr[i];
            countArray[arr[i]]--;
        }
        return outputArray;
    }
}
