import commonFunctions.CommonFunctions;

import java.math.BigInteger;

public class MultiplyStrings {
    public static void main(String[] args) {
        String a = CommonFunctions.getString();
        String b = CommonFunctions.getString();
        String result = multiplyStrings(a, b);
        System.out.println(result);
    }

    private static String multiplyStrings(String a, String b) {
        String result = "", str = "";
        int n = a.length(), m = b.length(), count = 0;
        for (int i = m - 1; i >= 0; i--) {
            int carry = 0;
            int len = result.length();
            int index = len - (count + 1);
            for (int j = n - 1; j >= 0; j--) {
                int val1 = b.charAt(i) - '0';
                int val2 = a.charAt(j) - '0';
                if (!result.isEmpty() && index >= 0) {
                    carry = carry + result.charAt(index) - '0';
                    index--;
                }
                int prod = (val1 * val2) + carry;
                int start = prod % 10;
                carry = prod / 10;
                str = start + str;
            }
            if (carry > 0) {
                str = carry + str;
            }
            count++;
            result = str;
            int size = result.length() - 1;
            str = "";
            for (int k = 0; k < count; k++) {
                str = result.charAt(size) + str;
                size--;
            }
        }
        int zeroCount = 0;
        for (int i=0;i<result.length();i++){
            if (result.charAt(i) == '0')
                zeroCount++;
        }
        if (zeroCount == result.length())
            return "0";
        return result;
    }
}
