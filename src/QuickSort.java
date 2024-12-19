import commonFunctions.CommonFunctions;

import java.util.ArrayList;

import static java.util.Collections.swap;

public class QuickSort {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        ArrayList<Integer> arr = CommonFunctions.create1DArrayList(size);
        quickSort(arr);
        System.out.println(arr);
    }

    private static void quickSort(ArrayList<Integer> arr) {
        int size = arr.size();
        int low = 0, high = size - 1;
        quickSort(arr, low, high);
    }

    private static void quickSort(ArrayList<Integer> arr, int low, int high) {
        if (low <= high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(ArrayList<Integer> arr, int low, int high) {
        int pivot = arr.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr.get(j) < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        i++;
        swap(arr, i, high);
        return i;
    }
}
