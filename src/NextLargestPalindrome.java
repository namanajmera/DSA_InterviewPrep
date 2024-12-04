import commonFunctions.CommonFunctions;

public class NextLargestPalindrome {
    public static void main(String[] args) {
        System.out.print("Enter the string in number:- ");
        String str = CommonFunctions.getString();
        String result = nextLargestPalindrome(str, str.length());
        System.out.println(result);
    }

    private static String nextLargestPalindrome(String str, int length) {
        boolean isPalin = isPalindrome(str, length);
        if (isPalin) {
            str = addOne(str, length);
        }
        if (str.length() % 2 == 0) {
            String leftHalf = str.substring(0, str.length() / 2);
            String rightHalf = str.substring(str.length() / 2);
            String revLeftHalf = reverseString(leftHalf);
            int compare = compareString(revLeftHalf, rightHalf);
            if (compare >= 0) {
                leftHalf += revLeftHalf;
            } else {
                leftHalf = addOne(leftHalf, leftHalf.length());
                revLeftHalf = reverseString(leftHalf);
                leftHalf += revLeftHalf;
            }
            return leftHalf;
        } else {
            String leftHalf = str.substring(0, str.length() / 2);
            String mid = str.substring(str.length() / 2, str.length() / 2 + 1);
            String rightHalf = str.substring(str.length() / 2 + 1);
            String revLeftHalf = reverseString(leftHalf);
            int compare = compareString(revLeftHalf, rightHalf);
            if (compare >= 0) {
                leftHalf = leftHalf + mid + revLeftHalf;
            } else {
                leftHalf += mid;
                leftHalf = addOne(leftHalf, leftHalf.length());
                mid = leftHalf.substring(leftHalf.length() - 1);
                leftHalf = leftHalf.substring(0, leftHalf.length() - 1);
                revLeftHalf = reverseString(leftHalf);
                leftHalf = leftHalf + mid + revLeftHalf;
            }
            return leftHalf;
        }
    }

    private static int compareString(String str1, String str2) {
        return str1.compareTo(str2);
    }

    private static String reverseString(String newString) {
        String revString = "";
        for (int i = newString.length() - 1; i >= 0; i--) {
            revString += newString.charAt(i);
        }
        return revString;
    }

    private static boolean isPalindrome(String str, int length) {
        int i = 0, j = length - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private static String addOne(String string, int length) {
        int carry = 1;
        String result = "";
        for (int i = length - 1; i >= 0; i--) {
            int digit = string.charAt(i) - '0';
            int sum = digit + carry;
            result = (sum % 10) + result;
            carry = sum / 10;
        }
        if (carry > 0) {
            result = carry + result;
        }
        return result;
    }
}
