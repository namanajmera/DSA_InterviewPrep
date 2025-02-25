import commonFunctions.CommonFunctions;

import java.util.ArrayList;

public class NumberSubArraysWithOddSum {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        int[] arr = CommonFunctions.create1DArray(size);
        int result = numOfSubarrays(arr);
        System.out.println(result);
    }

    private static int numOfSubarrays(int[] arr) {
        final int MOD = 1_000_000_007;
        int oddCount = 0, evenCount = 1, sum = 0, result = 0;
        for (int num : arr) {
            sum += num;
            if (sum % 2 != 0) {
                result = (result + evenCount) % MOD;
                oddCount++;
            } else {
                result = (result + oddCount) % MOD;
                evenCount++;
            }
        }
        return result;
    }
}
