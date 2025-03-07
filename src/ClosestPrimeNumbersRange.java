import commonFunctions.CommonFunctions;

import java.util.ArrayList;

public class ClosestPrimeNumbersRange {
    public static void main(String[] args) {
        int left = CommonFunctions.getInt();
        int right = CommonFunctions.getInt();
        int[] result = closestPrimes(left, right);
        CommonFunctions.print1DArray(result);
    }

    private static int[] closestPrimes(int left, int right) {
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isPrime(i)) {
                arrayList.add(i);
            }
        }
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < arrayList.size(); i++) {
            int currDiff = arrayList.get(i) - arrayList.get(i - 1);
            if (currDiff < minDiff && arrayList.get(i - 1) != 1) {
                minDiff = currDiff;
                result[0] = arrayList.get(i - 1);
                result[1] = arrayList.get(i);
            }
        }
        return result;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
