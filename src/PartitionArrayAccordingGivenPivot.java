import commonFunctions.CommonFunctions;

import java.util.ArrayList;

public class PartitionArrayAccordingGivenPivot {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        int[] nums = CommonFunctions.create1DArray(size);
        int pivot = CommonFunctions.getInt();
        int[] result = pivotArray(nums, pivot);
        CommonFunctions.print1DArray(result);
    }

    private static int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        int size = nums.length, left = 0, right = nums.length - 1;
        for (int i = 0, j = size - 1; i < size; i++, j--) {
            if (nums[i] < pivot)
                result[left++] = nums[i];
            if (nums[j] > pivot)
                result[right--] = nums[j];
        }
        while (left <= right) {
            result[left++] = pivot;
        }
        return result;
    }
}
