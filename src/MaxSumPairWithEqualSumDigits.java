import commonFunctions.CommonFunctions;

import java.util.HashMap;

public class MaxSumPairWithEqualSumDigits {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        int[] nums = CommonFunctions.create1DArray(size);
        int result = maximumSum(nums);
        System.out.println(result);
    }

    private static int maximumSum(int[] nums) {
        int length = nums.length, maxSum = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < length; i++) {
            int val = nums[i], sum = 0;
            while (val > 0) {
                int rem = val % 10;
                sum += rem;
                val /= 10;
            }
            if (hashMap.containsKey(sum)) {
                maxSum = Math.max(maxSum, hashMap.get(sum) + nums[i]);
                hashMap.put(sum, Math.max(hashMap.get(sum), nums[i]));
            } else {
                hashMap.put(sum, nums[i]);
            }
        }
        if (maxSum == 0)
            return -1;
        return maxSum;
    }
}

/*
If a key (sum of digits) already exists, you correctly compute maxSum, but you don't update the stored value in hashMap.
Instead of keeping just one number for each digit sum, you should keep the largest number so that future pairs can be maximized.
*/
