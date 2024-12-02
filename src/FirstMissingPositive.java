import commonFunctions.CommonFunctions;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        System.out.print("Enter the size of an array:- ");
        int size = CommonFunctions.getInt();
        System.out.print("Enter the elements:- ");
        int[] arr = CommonFunctions.create1DArray(size);
        int result = firstMissing(arr, size);
        System.out.println(result);
    }

    private static int firstMissing(int[] arr, int size) {
        int[] result = new int[size + 1];
        Arrays.fill(result, 0);
        for (int i = 0; i < size; i++) {
            if (arr[i] >= 0 && arr[i] <= size) {
                result[arr[i]] = 1;
            }
        }
        for (int i=1;i<result.length;i++){
            if (result[i] == 0){
                return i;
            }
        }
        return result.length;
    }
}
