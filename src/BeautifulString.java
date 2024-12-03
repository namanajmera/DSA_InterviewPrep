import commonFunctions.CommonFunctions;

public class BeautifulString {
    public static void main(String[] args) {
        System.out.print("Enter the string:- ");
        String str = CommonFunctions.getString();
        int result = makeBeautiful(str);
        System.out.println(result);
    }

    private static int makeBeautiful(String str) {
        String expect1 = expectString(0, str.length());
        String expect2 = expectString(1, str.length());
        int diff1 = differenceStr(str, expect1, str.length());
        int diff2 = differenceStr(str, expect2, str.length());
        return Math.min(diff1, diff2);
    }

    private static int differenceStr(String str, String expect, int length) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != expect.charAt(i))
                count++;
        }
        return count;
    }

    private static String expectString(int start, int length) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (start == 0) {
                result.append(0);
                start = 1;
            } else {
                result.append(1);
                start = 0;
            }
        }
        return result.toString();
    }
}
