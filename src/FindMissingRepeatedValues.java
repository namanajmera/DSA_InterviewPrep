import commonFunctions.CommonFunctions;

public class FindMissingRepeatedValues {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        int[][] grid = CommonFunctions.create2DArray(size, size);
        int[] ans = findMissingAndRepeatedValues(grid);
        CommonFunctions.print1DArray(ans);
    }

    private static int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = new int[2];
        int size = grid.length * grid.length;
        int[] temp = new int[size + 1];
        for (int[] ints : grid) {
            for (int j = 0; j < grid.length; j++) {
                temp[ints[j]] += 1;
            }
        }
        for (int i = 1; i < size + 1; i++) {
            if (temp[i] == 2)
                ans[0] = i;
            if (temp[i] == 0)
                ans[1] = i;
        }
        return ans;
    }
}
