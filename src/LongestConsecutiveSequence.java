import commonFunctions.CommonFunctions;

import java.util.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        int[] arr = CommonFunctions.create1DArray(size);
        int result = lengthOfLongestConsecutiveSequence(arr, size);
        System.out.println(result);
    }

    private static int lengthOfLongestConsecutiveSequence(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        Arrays.sort(arr);
        /*ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!arrayList.contains(arr[i])) {
                arrayList.add(arr[i]);
            }
        }*/
        int length = 1, maxLength = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] - arr[i - 1] == 1) {
                length++;
                maxLength = Math.max(length, maxLength);
            } else if (arr[i] - arr[i - 1] != 0) {
                length = 1;
            }
        }
        return maxLength;
    }
}
