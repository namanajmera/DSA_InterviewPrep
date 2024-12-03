import commonFunctions.CommonFunctions;

import java.util.Arrays;

public class ReverseStringWordWise {
    public static void main(String[] args) {
        System.out.print("Enter the string:- ");
        String str = CommonFunctions.getString();
        String result = reverseStringWordWise(str);
        System.out.println(result);
    }

    private static String reverseStringWordWiseSplit(String str) {
        String[] arrString = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String s : arrString) {
            result.insert(0, s + " ");
        }
        return result.toString().trim();
    }

    private static String reverseStringWordWise(String str) {
        String result = "", temp = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ' || i == 0) {
                if (i == 0) {
                    temp = str.charAt(i) + temp;
                }
                result += temp + ' ';
                temp = "";
            } else {
                temp = str.charAt(i) + temp;
            }
        }
        return result.trim();
    }
}
