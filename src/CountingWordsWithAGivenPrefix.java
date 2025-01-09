import commonFunctions.CommonFunctions;

public class CountingWordsWithAGivenPrefix {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        String[] words = CommonFunctions.create1DArrayString(size);
        String pref = CommonFunctions.getString();
        int result = prefixCount(words, pref);
        System.out.println(result);

    }

    private static int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }
}
