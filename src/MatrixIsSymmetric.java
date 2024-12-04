import commonFunctions.CommonFunctions;

public class MatrixIsSymmetric {
    public static void main(String[] args) {
        System.out.print("Enter the size of n,m:- ");
        int n = CommonFunctions.getInt();
        int m = CommonFunctions.getInt();
        int[][] matrix = CommonFunctions.create2DArray(n, m);
        boolean result = isMatrixSymmetric(matrix);
        System.out.println(result);
    }

    private static boolean isMatrixSymmetric(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
