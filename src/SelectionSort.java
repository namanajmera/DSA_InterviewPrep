import commonFunctions.CommonFunctions;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.print("Enter the size of an array:- ");
        int size = CommonFunctions.getInt();
        System.out.print("Enter the elements:- ");
        int[] arr = CommonFunctions.create1DArray(size);
        selectionSort(arr, size);
        CommonFunctions.print1DArray(arr);
    }

    private static void selectionSort(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            int smallest = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }
}
