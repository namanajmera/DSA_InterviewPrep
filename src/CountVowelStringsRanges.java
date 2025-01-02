import commonFunctions.CommonFunctions;

public class CountVowelStringsRanges {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        String[] words = CommonFunctions.create1DArrayString(size);
        System.out.print("Enter the size of matrix:- ");
        int n = CommonFunctions.getInt();
        int m = CommonFunctions.getInt();
        int[][] queries = CommonFunctions.create2DArray(n, m);
        int[] result = vowelStrings(words, queries);
        CommonFunctions.print1DArray(result);
    }

    private static int[] vowelStrings(String[] words, int[][] queries) {
        int[] ans = new int[queries.length];
        int[] prefixSum = new int[words.length + 1]; // Prefix sum array
        String vowels = "aeiou";

        // Step 1: Build Prefix Sum
        for (int i = 0; i < words.length; i++) {
            char chFirst = words[i].charAt(0);
            char chLast = words[i].charAt(words[i].length() - 1);
            if (vowels.indexOf(chFirst) != -1 && vowels.indexOf(chLast) != -1) {
                prefixSum[i + 1] = prefixSum[i] + 1;
            } else {
                prefixSum[i + 1] = prefixSum[i];
            }
        }

        // Step 2: Answer Queries using Prefix Sum
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            ans[i] = prefixSum[end + 1] - prefixSum[start];
        }
        return ans;
    }
}
