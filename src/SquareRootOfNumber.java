import commonFunctions.CommonFunctions;

public class SquareRootOfNumber {
    public static void main(String[] args) {
        long N = CommonFunctions.getLong();
        int result = sqrtN(N);
        System.out.println(result);
    }

    private static int sqrtN(long n) {
        int i = 1, result = 1;
        while (result <= n) {
            i++;
            result = i * i;
        }
        return i - 1;
    }
}
