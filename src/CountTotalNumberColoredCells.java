import commonFunctions.CommonFunctions;

public class CountTotalNumberColoredCells {
    public static void main(String[] args) {
        int n = CommonFunctions.getInt();
        long result = coloredCells(n);
        System.out.println(result);
    }

    private static long coloredCells(int n) {
        return 1 + 4L * n * (n - 1) / 2;
    }
}
