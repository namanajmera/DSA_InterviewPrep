import commonFunctions.CommonFunctions;

public class MoveAllNegativeNumbersToBeginningAndPositiveToEnd {
    public static void main(String[] args) {
        System.out.print("Enter the size of an array:- ");
        int size = CommonFunctions.getInt();
        System.out.print("Enter the elements:- ");
        int[] arr = CommonFunctions.create1DArray(size);
        int[] result = separateNegativeAndPositive(arr, size);
        CommonFunctions.print1DArray(result);

    }

    private static int[] separateNegativeAndPositive(int[] arr, int size) {
        int i = 0, j = size - 1;
        while (i < j) {
            if (arr[i] > 0 && arr[j] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else if (arr[i] > 0) {
                j--;
            } else {
                i++;
            }
        }
        return arr;
    }
}
