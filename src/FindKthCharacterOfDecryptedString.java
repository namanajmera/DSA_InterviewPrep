import commonFunctions.CommonFunctions;

public class FindKthCharacterOfDecryptedString {
    public static void main(String[] args) {
        String str = CommonFunctions.getString();
        Long k = CommonFunctions.getLong();
        char ch = kThCharaterOfDecryptedString(str, k);
        System.out.println(ch);
    }

    private static char kThCharaterOfDecryptedString(String str, Long k) {
        int freq, i = 0, j, length, num;
        int size = str.length();
        while (i < size) {
            j = i;
            length = 0;
            freq = 0;
            while (j < size && Character.isAlphabetic(str.charAt(j))) {
                length++;
                j++;
            }
            while (j < size && Character.isDigit(str.charAt(j))) {
                freq = freq * 10 + (str.charAt(j) - '0');
                j++;
            }
            num = length * freq;
            if (k > num) {
                k -= num;
                i = j;
            } else {
                k--;
                k %= length;
                return str.charAt((int) (i + k));
            }
        }
        return str.charAt((int) (k - 1));
    }
}
