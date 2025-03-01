import commonFunctions.CommonFunctions;

public class ApplyOperationsToAnArray {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        int[] nums = CommonFunctions.create1DArray(size);
        int[] result = applyOperations(nums);
        CommonFunctions.print1DArray(result);
    }

    private static int[] applyOperations(int[] nums) {
        int[] result = new int[nums.length];
        int size = nums.length;
        for (int i = 0; i < size - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }
        int i = 0, newIndex = 0;
        for (; i < size; i++) {
            if (nums[i] != 0) {
                result[newIndex++] = nums[i];
            }
        }
        return result;
    }
}
