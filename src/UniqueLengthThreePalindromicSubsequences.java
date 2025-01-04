import commonFunctions.CommonFunctions;

import java.util.ArrayList;

public class UniqueLengthThreePalindromicSubsequences {
    public static void main(String[] args) {
        String str = CommonFunctions.getString();
        int result = countPalindromicSubsequence(str);
        System.out.println(result);
    }

    private static int countPalindromicSubsequence(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        int lastIndex = str.length() - 1;
        for (int i = 0; i <= str.length(); i++) {
            if (str.charAt(i) == str.charAt(lastIndex)) {
                for (int j = i + 1; j < lastIndex - 1; j++) {
                    String s = str.charAt(i) + "";
                    s += str.charAt(j);
                    s += str.charAt(lastIndex);
                    if (!arrayList.contains(s)) {
                        arrayList.add(s);
                    }
                }
                lastIndex--;
            }
        }
        return arrayList.size();
    }
}
