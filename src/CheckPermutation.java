import commonFunctions.CommonFunctions;

import java.util.HashMap;
import java.util.Map;

public class CheckPermutation {
    public static void main(String[] args) {
        System.out.print("Enter the 1st string:- ");
        String str1 = CommonFunctions.getString();
        System.out.print("Enter the 2nd string:- ");
        String str2 = CommonFunctions.getString();
        boolean result = areAnagram(str1, str2);
        System.out.println(result);
    }

    private static boolean areAnagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int size = str1.length();
        for (int i = 0; i < size; i++) {
            char ch = str1.charAt(i);
            if (hashMap.containsKey(ch)) {
                hashMap.put(ch, hashMap.get(ch) + 1);
            } else
                hashMap.put(ch, 1);
        }
        for (int i = 0; i < size; i++) {
            char ch = str2.charAt(i);
            if (hashMap.containsKey(ch)) {
                hashMap.put(ch, hashMap.get(ch) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
