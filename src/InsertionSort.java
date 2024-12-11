import commonFunctions.CommonFunctions;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.print("Enter the size of an array:- ");
        int size = CommonFunctions.getInt();
        System.out.print("Enter the elements:- ");
        int[] arr = CommonFunctions.create1DArray(size);
        insertionSort(arr, size);
        CommonFunctions.print1DArray(arr);
    }

    private static void insertionSort(int[] arr, int size) {
        for (int i = 1; i < size; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
}
