import commonFunctions.CommonFunctions;

public class CheckNumberSumPowersThree {
    public static void main(String[] args) {
        int n = CommonFunctions.getInt();
        boolean result = checkPowersOfThree(n);
        System.out.println(result);
    }

    private static boolean checkPowersOfThree(int n) {
        while (n > 0) {
            if (n % 3 == 2) {
                return false;
            }
            n /= 3;
        }
        return true;
    }
}
