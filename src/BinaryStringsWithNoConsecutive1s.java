import commonFunctions.CommonFunctions;

import java.util.ArrayList;
import java.util.List;

public class BinaryStringsWithNoConsecutive1s {
    public static void main(String[] args) {
        int n = CommonFunctions.getInt();
        List<String> list = generateString(n);
        System.out.println(list);
    }

    private static List<String> generateString(int n) {
//        int maxBinaryLength = (int) Math.pow(2, n - 1);
        int totalLength = (int) Math.pow(2, n) - 1;
        List<String> result = new ArrayList<>();
        for (int i = 0; i <= totalLength; i++) {
            String str = String.format("%" + n + "s", Integer.toBinaryString(i)).replace(' ', '0');
            boolean flag = true;
            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(j - 1) == '1' && str.charAt(j) == '1') {
                    flag = false;
                    break;
                }
            }
            if (flag)
                result.add(str);
        }
        return result;
    }
}
