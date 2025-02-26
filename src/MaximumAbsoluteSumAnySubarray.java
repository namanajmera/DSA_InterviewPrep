import commonFunctions.CommonFunctions;

public class MaximumAbsoluteSumAnySubarray {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        int[] nums = CommonFunctions.create1DArray(size);
        int result = maxAbsoluteSum(nums);
        System.out.println(result);
    }

    private static int maxAbsoluteSum(int[] nums) {
        int maxSum = Integer.MIN_VALUE, minSum = Integer.MAX_VALUE, max_curr_sum = 0, min_curr_sum = 0;
        for (int num : nums) {
            max_curr_sum += num;
            min_curr_sum += num;
            maxSum = Math.max(max_curr_sum, maxSum);
            minSum = Math.min(min_curr_sum, minSum);
            if (min_curr_sum >= 0) {
                min_curr_sum = 0;
            }
            if (max_curr_sum <= 0) {
                max_curr_sum = 0;
            }
        }
        return Math.max(Math.abs(minSum), maxSum);
    }
}
