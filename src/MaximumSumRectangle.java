import commonFunctions.CommonFunctions;

import java.util.Arrays;

public class MaximumSumRectangle {
    public static void main(String[] args) {
        System.out.print("Enter the size of n,m:- ");
        int n = CommonFunctions.getInt();
        int m = CommonFunctions.getInt();
        int[][] matrix = CommonFunctions.create2DArray(n, m);
        int result = maxSumRectangle(matrix, n, m);
        System.out.println(result);
    }

    private static int maxSumRectangle(int[][] matrix, int n, int m) {
        int[] sum = new int[n];
        int maxSum = Integer.MIN_VALUE;
        for (int colStart = 0; colStart < m; colStart++) {
            Arrays.fill(sum, 0);
            for (int colEnd = colStart; colEnd < m; colEnd++) {
                for (int row = 0; row < n; row++) {
                    sum[row] += matrix[row][colEnd];
                }
                int curSum = kadene(sum);
                maxSum = Math.max(maxSum, curSum);
            }
        }
        return maxSum;
    }

    private static int kadene(int[] sum) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < sum.length; i++) {
            currSum += sum[i];
            maxSum = Math.max(maxSum, currSum);
            if (currSum <= 0)
                currSum = 0;
        }
        return maxSum;
    }
}
