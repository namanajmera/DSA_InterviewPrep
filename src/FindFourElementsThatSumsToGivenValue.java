import commonFunctions.CommonFunctions;

import java.util.HashSet;
import java.util.Set;

public class FindFourElementsThatSumsToGivenValue {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        int target = CommonFunctions.getInt();
        int[] arr = CommonFunctions.create1DArray(size);
        String result = fourSum(arr, target, size);
        System.out.println(result);
    }

    private static String fourSum(int[] arr, int target, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                Set<Integer> set = new HashSet<>();
                for (int k = j + 1; k < n; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    int item = target - sum;
                    if (set.contains(item)) {
                        return "Yes";
                    }
                    set.add(arr[k]);
                }
            }
        }
        return "No";
    }
}
