import commonFunctions.CommonFunctions;

public class NonDecreasingArray {
    public static void main(String[] args) {
        System.out.print("Enter the size of an array:- ");
        int size = CommonFunctions.getInt();
        System.out.print("Enter the elements:- ");
        int[] arr = CommonFunctions.create1DArray(size);
        boolean result = isPossible(arr, size);
        System.out.println(result);
    }

    private static boolean isPossible(int[] arr, int n) {
        boolean changed = false;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                continue;
            }
            if (changed)
                return false;
            if (i == 0 || arr[i - 1] <= arr[i + 1]) {
                arr[i] = arr[i + 1];
            } else {
                arr[i + 1] = arr[i];
            }
            changed = true;
        }
        return true;
    }
}
