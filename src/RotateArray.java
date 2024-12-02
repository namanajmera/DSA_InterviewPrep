import commonFunctions.CommonFunctions;

public class RotateArray {
    public static void main(String[] args) {
        System.out.print("Enter the size of an array:- ");
        int size = CommonFunctions.getInt();
        System.out.print("Enter the elements:- ");
        int[] arr = CommonFunctions.create1DArray(size);
        System.out.print("Enter the point to rotate array:- ");
        int k = CommonFunctions.getInt();
        int[] result = rotateArray(arr, size, k);
        CommonFunctions.print1DArray(result);
    }

    private static int[] rotateArray(int[] arr, int size, int k) {
        int[] result = new int[size];
        int i = 0;
        int j = k;
        while (k < size) {
            result[i++] = arr[k++];
        }
        int l = 0;
        while (l < j) {
            result[i++] = arr[l++];
        }
        return result;
    }
}
