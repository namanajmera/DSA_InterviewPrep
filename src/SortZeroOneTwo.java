//Dutch National Flag Algorithm

import commonFunctions.CommonFunctions;

public class SortZeroOneTwo {
    public static void main(String[] args) {
        System.out.print("Enter the size of an array:- ");
        int size = CommonFunctions.getInt();
        System.out.print("Enter the elements:- ");
        int[] arr = CommonFunctions.create1DArray(size);
        sort012(arr);
        CommonFunctions.print1DArray(arr);

    }

    private static void sort012(int[] arr) {
        int n0 = 0, n1 = 0, n2 = arr.length - 1;
        while (n1 <= n2) {
            switch (arr[n1]) {
                case 0:
                    CommonFunctions.swapArray(arr, n0, n1);
                    n0++;
                    n1++;
                    break;
                case 1:
                    n1++;
                    break;
                case 2:
                    CommonFunctions.swapArray(arr, n1, n2);
                    n2--;
                    break;
                default:
                    break;
            }
        }
    }
}
