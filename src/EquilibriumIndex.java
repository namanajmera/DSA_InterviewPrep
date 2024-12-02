import commonFunctions.CommonFunctions;

public class EquilibriumIndex {
    public static void main(String[] args) {
        System.out.print("Enter the size of an array:- ");
        int size = CommonFunctions.getInt();
        System.out.print("Enter the elements:- ");
        int[] arr = CommonFunctions.create1DArray(size);
        int result = arrayEquilibriumIndex(arr, size);
        System.out.print(result);
    }

    private static int arrayEquilibriumIndex(int[] arr, int size) {
        int leftSum = 0, sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < size; i++) {
            sum -= arr[i];
            if (leftSum == sum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
}
