import commonFunctions.CommonFunctions;

import java.util.ArrayList;

public class SearchRotatedSortedArray {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        int target = CommonFunctions.getInt();
        int[] arr = CommonFunctions.create1DArray(size);
        int result = search(arr, target);
        System.out.println(result);
    }

    private static int search(int[] arr, int key) {
        int s = 0, e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == key)
                return mid;
            if (arr[s] <= arr[mid]) { // Left Sorted
                if (arr[s] <= key && key <= arr[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            } else { // Right Sorted
                if (arr[mid] <= key && key <= arr[e]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
        return -1;
    }
}
