import commonFunctions.CommonFunctions;

public class CountAllSubarraysWithGivenSum {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        int target = CommonFunctions.getInt();
        int[] arr = CommonFunctions.create1DArray(size);
        int result = findAllSubarraysWithGivenSum(arr, target);
        System.out.println(result);
    }

    private static int findAllSubarraysWithGivenSum(int[] arr, int s) {
        int count = 0, size = arr.length;
        for (int i = 0; i < size; i++) {
            int sum = arr[i];
            if (sum == s) {
                count++;
            }
            for (int j = i + 1; j < size; j++) {
                sum += arr[j];
                if (sum == s) {
                    count++;
                }
            }
        }
        return count;
    }
}
