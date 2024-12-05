import commonFunctions.CommonFunctions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        System.out.print("Enter the string:- ");
        String str = CommonFunctions.getString();
        char result = firstNonRepeatingCharacter(str);
        System.out.println(result);
    }

    private static char firstNonRepeatingCharacter(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char value = str.charAt(i);
            if (hashMap.containsKey(value)) {
                hashMap.put(value, hashMap.get(value) + 1);
            } else {
                hashMap.put(value, 1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            char value = str.charAt(i);
            if (hashMap.get(value) == 1) {
                return value;
            }
        }
        return str.charAt(0);
    }
}
