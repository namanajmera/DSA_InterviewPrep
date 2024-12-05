import commonFunctions.CommonFunctions;

import java.util.HashMap;

public class LongestSubarrayZeroSum {
    public static void main(String[] args) {
        System.out.print("Enter the size of an array:- ");
        int size = CommonFunctions.getInt();
        System.out.print("Enter the elements:- ");
        int[] arr = CommonFunctions.create1DArray(size);
        int result = LongestSubsetWithZeroSum(arr);
        System.out.println(result);
    }

    private static int LongestSubsetWithZeroSum(int[] arr) {
//        int n = arr.length, maxLength = 0;
//        for (int i = 0; i < n; i++) {
//            int currSum = 0;
//            for (int j = i; j < n; j++) {
//                currSum += arr[j];
//                if (currSum == 0) {
//                    maxLength = Math.max(maxLength, j - i + 1);
//                }
//            }
//        }
//        return maxLength;
        int n = arr.length, maxLength = 0, sum = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0) {
                maxLength = i + 1;
            }
            if (hashMap.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - hashMap.get(sum));
            } else {
                hashMap.put(sum, i);
            }
        }
        return maxLength;
    }
}
