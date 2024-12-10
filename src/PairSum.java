import commonFunctions.CommonFunctions;

public class PairSum {
    public static void main(String[] args) {
        System.out.print("Enter the size of an array:- ");
        int size = CommonFunctions.getInt();
        System.out.print("Enter the elements:- ");
        int[] arr = CommonFunctions.create1DArray(size);
        System.out.print("ENter the target:- ");
        int target = CommonFunctions.getInt();
        int result = pairSum(arr, size, target);
        System.out.println(result);
    }

    private static int pairSum(int[] arr, int size, int target) {
        int i = 0, j = size - 1, count = 0;
        while (i < j) {
            int currentSUm = arr[i] + arr[j];
            if (currentSUm < target) {
                i++;
            } else if (currentSUm > target) {
                j--;
            } else {
                i++;
                j--;
                count++;
            }
        }
        if (count == 0) {
            return -1;
        }
        return count;
    }
}
