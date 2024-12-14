import commonFunctions.CommonFunctions;

import java.util.ArrayList;

public class MaximumSubarraySumAfterKthConcatenation {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        int k = CommonFunctions.getInt();
        ArrayList<Integer> arr = CommonFunctions.create1DArrayList(size);
        long result = maxSubSumKConcat(arr, size, k);
        System.out.println(result);
    }

    private static long maxSubSumKConcat(ArrayList<Integer> arr, int n, int k) {
        long currSum = 0, maxSum = Integer.MIN_VALUE;
        while (k > 0) {
            for (int i = 0; i < n; i++) {
                currSum += arr.get(i);
                maxSum = Math.max(currSum, maxSum);
                if (currSum <= 0)
                    currSum = 0;
            }
            k--;
        }
        return maxSum;
    }
}
