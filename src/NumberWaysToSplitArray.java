import commonFunctions.CommonFunctions;

public class NumberWaysToSplitArray {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        int[] arr = CommonFunctions.create1DArray(size);
        int result = waysToSplitArray(arr);
        System.out.println(result);
    }

    private static int waysToSplitArray(int[] arr) {
        long totalSum = 0;
        int ways = 0, size = arr.length;
        for (Integer val : arr) {
            totalSum += val;
        }
        long currentSum = 0;
        for (int i = 0; i < size - 1; i++) {
            currentSum += arr[i];
            totalSum -= arr[i];
            if (currentSum >= totalSum)
                ways++;
        }
        return ways;
    }
}
