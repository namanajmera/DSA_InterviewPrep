import commonFunctions.CommonFunctions;

public class MaximumSumCircularSubarray {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        int[] arr = CommonFunctions.create1DArray(size);
        int result = maxSubarraySum(arr, size);
        System.out.println(result);
    }

    private static int maxSubarraySum(int[] arr, int n) {
        int currMaxSum = 0, currMinSum = 0, totalSum = 0, maxSum = arr[0], minSum = arr[0];
        for (int i = 0; i < n; i++) {
            currMaxSum = Math.max(currMaxSum + arr[i], arr[i]);
            maxSum = Math.max(maxSum, currMaxSum);


            currMinSum = Math.min(currMinSum + arr[i], arr[i]);
            minSum = Math.min(minSum, currMinSum);

            totalSum += arr[i];
        }

        int normalSum = maxSum;
        int circularSum = totalSum - minSum;
        if (totalSum == minSum)
            return normalSum;
        return Math.max(normalSum, circularSum);
    }
}
