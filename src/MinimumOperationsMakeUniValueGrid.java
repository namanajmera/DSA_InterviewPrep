import commonFunctions.CommonFunctions;

import java.util.ArrayList;
import java.util.Collections;

public class MinimumOperationsMakeUniValueGrid {
    public static void main(String[] args) {
        int n = CommonFunctions.getInt();
        int m = CommonFunctions.getInt();
        int[][] grid = CommonFunctions.create2DArray(n, m);
        int x = CommonFunctions.getInt();
        int result = minOperations(grid, x);
        System.out.println(result);
    }

    private static int minOperations(int[][] grid, int x) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int rem = grid[0][0] % x;
        int n = grid.length, m = grid[0].length;
        for (int[] val : grid) {
            for (int j = 0; j < m; j++) {
                if (val[j] % x != rem)
                    return -1;
                arrayList.add(val[j]);
            }
        }
        Collections.sort(arrayList);
        int median = arrayList.size() / 2;
        int count = 0;
        for (Integer integer : arrayList) {
            count += Math.abs(arrayList.get(median) - integer) / x;
        }
        return count;
    }
}
