import commonFunctions.CommonFunctions;

import java.util.HashMap;

public class DivideArrayIntoEqualPairs {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        int[] nums = CommonFunctions.create1DArray(size);
        boolean result = divideArray(nums);
        System.out.println(result);
    }

    private static boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> counter = new HashMap<>();
        for (Integer val : nums) {
            counter.put(val, counter.getOrDefault(val, 0) + 1);
        }
        for (Integer count : counter.values()) {
            if (count % 2 != 0)
                return false;
        }
        return true;
    }
}
