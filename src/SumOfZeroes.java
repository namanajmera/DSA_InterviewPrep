import commonFunctions.CommonFunctions;

public class SumOfZeroes {
    public static void main(String[] args) {
        System.out.print("Enter the size of n and m:- ");
        int n = CommonFunctions.getInt();
        int m = CommonFunctions.getInt();
        int[][] matrix = CommonFunctions.create2DArray(n, m);
        int result = coverageOfMatrix(matrix);
        System.out.println(result);
    }

    private static int coverageOfMatrix(int[][] matrix) {
        int count = 0;
        int n = matrix.length, m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    if (i > 0 && matrix[i - 1][j] == 1)
                        count++;
                    if (i < n - 1 && matrix[i + 1][j] == 1)
                        count++;
                    if (j > 0 && matrix[i][j - 1] == 1)
                        count++;
                    if (j < m - 1 && matrix[i][j + 1] == 1)
                        count++;
                }
            }
        }
        return count;
    }
}
