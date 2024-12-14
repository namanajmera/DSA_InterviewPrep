import commonFunctions.CommonFunctions;

public class RotateMatrixToTheRight {
    public static void main(String[] args) {
        System.out.print("Enter the size of n,m and k:- ");
        int n = CommonFunctions.getInt();
        int m = CommonFunctions.getInt();
        int k = CommonFunctions.getInt();
        int[][] matrix = CommonFunctions.create2DArray(n, m);
        int[][] result = rotateMatRight(matrix, n, m, k);
        CommonFunctions.print2DArrayInLine(result, n, m);
    }

    private static int[][] rotateMatRight(int[][] matrix, int n, int m, int k) {
        int[][] output = new int[n][m];
        if (k >= m) {
            k %= m;
        }
        for (int i = 0; i < n; i++) {
            int temp = 0;
            while (temp < k) {
                for (int j = 1; j < m; j++) {
                    output[i][j] = matrix[i][j - 1];
                }
                output[i][0] = matrix[i][m - 1];
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = output[i][j];
                }
                temp++;
            }
        }
        return matrix;
    }
}
