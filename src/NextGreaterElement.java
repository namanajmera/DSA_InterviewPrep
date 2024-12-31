import commonFunctions.CommonFunctions;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        int[] arr = CommonFunctions.create1DArray(size);
        int[] result = nextGreater(arr, size);
        CommonFunctions.print1DArray(result);
    }

    private static int[] nextGreater(int[] arr, int n) {
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] >= stack.peek()) {
                stack.pop();
            }
            if (stack.isEmpty())
                result[i] = -1;
            else
                result[i] = stack.peek();
            stack.push(arr[i]);
        }
        return result;
    }
}
