import commonFunctions.CommonFunctions;

import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        int k = CommonFunctions.getInt();
        int[] arr = CommonFunctions.create1DArray(size);
        int result = aggressiveCows(arr, k);
        System.out.println(result);
    }

    private static int aggressiveCows(int[] arr, int k) {
        Arrays.sort(arr);
        int ans = -1, n = arr.length;
        int start = 1, end = arr[n - 1] - arr[0];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(arr, n, k, mid)) {
                start = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] arr, int n, int k, int midPossible) {
        int count = 1, lastPossible = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] - lastPossible >= midPossible) {
                count++;
                lastPossible = arr[i];
                if (count == k)
                    return true;
            }
        }
        return false;
    }
}
