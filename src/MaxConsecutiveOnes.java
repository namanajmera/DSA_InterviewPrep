import commonFunctions.CommonFunctions;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        int[] nums = CommonFunctions.create1DArray(size);
        int result = findMaxConsecutiveOnes(nums);
        System.out.println(result);
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, current = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                current++;
            else {
                max = Math.max(current, max);
                current = 0;
            }
        }
        max = Math.max(current, max);
        return max;
    }
}
