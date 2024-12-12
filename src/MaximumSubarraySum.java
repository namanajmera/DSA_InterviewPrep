import commonFunctions.CommonFunctions;

//Kadane’s Algoritm
public class MaximumSubarraySum {
    public static void main(String[] args) {
        System.out.print("Enter the size of an array:- ");
        int size = CommonFunctions.getInt();
        System.out.print("Enter the elements:- ");
        int[] arr = CommonFunctions.create1DArray(size);
        int result = maxSubarraySum(arr, size);
        System.out.println(result);

    }

    private static int maxSubarraySum(int[] arr, int n) {
        int max_sum = Integer.MIN_VALUE, curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += arr[i];
            max_sum = Math.max(curr_sum, max_sum);
            if (curr_sum <= 0)
                curr_sum = 0;
        }
        return Math.max(max_sum, 0);
    }
}
