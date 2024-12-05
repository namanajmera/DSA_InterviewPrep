import commonFunctions.CommonFunctions;

public class CountSubArraysDivisibleByK {
    public static void main(String[] args) {
        System.out.print("Enter the size of an array:- ");
        int size = CommonFunctions.getInt();
        System.out.print("Enter the elements:- ");
        int[] arr = CommonFunctions.create1DArray(size);
        System.out.print("Enter the k:- ");
        int k = CommonFunctions.getInt();
        int result = subArrayCount(arr, k);
        System.out.println(result);

    }

    private static int subArrayCount(int[] arr, int k) {
        int maxLength = 0, n = arr.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum+=arr[j];
                if (sum % k == 0){
                    maxLength++;
                }
            }
        }
        return maxLength;
    }
}
