import commonFunctions.CommonFunctions;

public class MergeSort {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        int[] arr = CommonFunctions.create1DArray(size);
        mergeSort(arr, size);
        CommonFunctions.print1DArray(arr);
    }

    private static void mergeSort(int[] arr, int size) {
        int start = 0, end = size - 1;
        mergeSort(arr, start, end);
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            mergeArray(arr, start, mid, end);
        }
    }

    private static void mergeArray(int[] arr, int start, int mid, int end) {
        int[] merger = new int[end - start + 1];
        int i1 = start;
        int i2 = mid + 1;
        int x = 0;
        while (i1 <= mid && i2 <= end) {
            if (arr[i1] <= arr[i2])
                merger[x++] = arr[i1++];
            else
                merger[x++] = arr[i2++];
        }

        while (i1 <= mid) {
            merger[x++] = arr[i1++];
        }

        while (i2 <= end) {
            merger[x++] = arr[i2++];
        }
        for (int i = 0, j = start; i < merger.length; i++, j++) {
            arr[j] = merger[i];
        }
    }
}
