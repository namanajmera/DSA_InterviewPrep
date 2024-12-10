import commonFunctions.CommonFunctions;

public class IsSubSequence {
    public static void main(String[] args) {
        System.out.print("Enter 1st String:- ");
        String str1 = CommonFunctions.getString();
        System.out.print("Enter 2nd String:- ");
        String str2 = CommonFunctions.getString();
        String result = isSubsequence(str1, str2);
        System.out.println(result);
    }

    private static String isSubsequence(String str1, String str2) {
        int i = 0, j = 0, size1 = str1.length(), size2 = str2.length();
        while (j < size2) {
            if (str1.charAt(i) == str2.charAt(j)) {
                i++;
            }
            j++;
            if (i == size1) {
                return "True";
            }
        }
        return "False";
    }
}
