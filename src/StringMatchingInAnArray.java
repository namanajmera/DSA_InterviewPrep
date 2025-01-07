import commonFunctions.CommonFunctions;

import java.util.ArrayList;
import java.util.List;

public class StringMatchingInAnArray {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        String[] words = CommonFunctions.create1DArrayString(size);
        List<String> result = stringMatching(words);
        System.out.println(result);
    }

    private static List<String> stringMatching(String[] words) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (j != i && words[i].contains(words[j]) && !strings.contains(words[j])) {
                    strings.add(words[j]);
                }
            }
        }
        return strings;
    }
}
