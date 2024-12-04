import commonFunctions.CommonFunctions;

public class PrintSpiral {
    public static void main(String[] args) {
        System.out.print("Enter the size of n,m:- ");
        int n = CommonFunctions.getInt();
        int m = CommonFunctions.getInt();
        int[][] matrix = CommonFunctions.create2DArray(n, m);
        spiralPrint(matrix);
    }

    public static void spiralPrint(int[][] matrix){
        //Your code goes here
        if (matrix.length == 0) {
            return;
        }
        int nRows = matrix.length;
        int nCols = matrix[0].length;
        int count = 0;
        int length = nRows * nCols;
        int rowStart = 0;
        int rowEnd = nRows - 1;
        int colStart = 0;
        int colEnd = nCols - 1;

        while (count < length && rowStart <= rowEnd && colStart <= colEnd) {

            for (int i = colStart; i <= colEnd && count < length; i++) {
                System.out.print(matrix[rowStart][i] + " ");
                count++;
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd && count < length; i++) {
                System.out.print(matrix[i][colEnd] + " ");
                count++;
            }
            colEnd--;

            for (int i = colEnd; i >= colStart && count < length; i--) {
                System.out.print(matrix[rowEnd][i] + " ");
                count++;
            }
            rowEnd--;

            for (int i = rowEnd; i >= rowStart && count < length; i--) {
                System.out.print(matrix[i][colStart] + " ");
                count++;
            }
            colStart++;
        }
    }
}
