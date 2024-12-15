import commonFunctions.CommonFunctions;

import java.util.ArrayList;

public class FindAllSubSquareOfSizeK {
    public static void main(String[] args) {
        int n = CommonFunctions.getInt();
        int k = CommonFunctions.getInt();
        ArrayList<ArrayList<Integer>> arrayList = CommonFunctions.create2DArrayList(n, n);
        ArrayList<ArrayList<Integer>> result = sumOfKxKMatrices(arrayList, n, k);
        System.out.println(result);
    }

    private static ArrayList<ArrayList<Integer>> sumOfKxKMatrices(ArrayList<ArrayList<Integer>> arr, int n, int k) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        int[][] prefixSum = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                prefixSum[i][j] = arr.get(i - 1).get(j - 1)
                        + prefixSum[i - 1][j]
                        + prefixSum[i][j - 1]
                        - prefixSum[i - 1][j - 1];
            }
        }

        for (int i = 0; i <= n - k; i++) {
            ArrayList<Integer> rowResult = new ArrayList<>();
            for (int j = 0; j <= n - k; j++) {
                int x1 = i + 1, y1 = j + 1;
                int x2 = i + k, y2 = j + k;

                int subMatrixSum = prefixSum[x2][y2]
                        - prefixSum[x1 - 1][y2]
                        - prefixSum[x2][y1 - 1]
                        + prefixSum[x1 - 1][y1 - 1];

                rowResult.add(subMatrixSum);
            }
            result.add(rowResult);
        }

        return result;
    }
}
