import commonFunctions.CommonFunctions;

public class CountPrefixAndSuffixPairsI {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        String[] words = CommonFunctions.create1DArrayString(size);
        int result = countPrefixSuffixPairs(words);
        System.out.println(result);
    }

    private static int countPrefixSuffixPairs(String[] words) {
        int count = 0, n = words.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isPrefixAndSuffix(String str1, String str2) {
        int length1 = str1.length(), length2 = str2.length();
        if (length1 > length2) {
            return false;
        }
        return str2.substring(0, length1).equals(str1) && str2.substring(length2 - length1).equals(str1);
    }
}
