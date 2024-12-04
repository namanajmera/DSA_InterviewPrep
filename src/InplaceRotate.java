import commonFunctions.CommonFunctions;

public class InplaceRotate {
    public static void main(String[] args) {
        System.out.print("Enter the size of n,m:- ");
        int n = CommonFunctions.getInt();
        int m = CommonFunctions.getInt();
        int[][] matrix = CommonFunctions.create2DArray(n, m);
        inplaceRotate(matrix, n);
        CommonFunctions.print2DArray(matrix, n, m);
    }

    private static void inplaceRotate(int[][] matrix, int n) {
        transposeMatrix(matrix, n);
        int i = 0, k = n - 1;
        while (i < k) {
            for (int j = 0; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[k][j];
                matrix[k][j] = temp;
            }
            k--;
            i++;
        }
    }

    private static void transposeMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
