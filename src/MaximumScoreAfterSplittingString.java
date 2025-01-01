import commonFunctions.CommonFunctions;

public class MaximumScoreAfterSplittingString {
    public static void main(String[] args) {
        String str = CommonFunctions.getString();
        int result = maxScore(str);
        System.out.println(result);
    }

    private static int maxScore(String str) {
        int length = str.length();
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < length; i++) {
            String left = str.substring(0, i);
            String right = str.substring(i, length);
            int countZero = countZeroOrOne(0, left);
            int countOne = countZeroOrOne(1, right);
            max = Math.max(countOne + countZero, max);
        }
        return max;
    }

    private static int countZeroOrOne(int i, String str) {
        int zeroCount = 0;
        int oneCount = 0;
        if (i == 0) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '0')
                    zeroCount++;
            }
            return zeroCount;
        } else {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '1')
                    oneCount++;
            }
            return oneCount;
        }
    }
}
