import commonFunctions.CommonFunctions;

public class ShiftingLettersII {
    public static void main(String[] args) {
        String s = CommonFunctions.getString();
        int n = CommonFunctions.getInt();
        int m = CommonFunctions.getInt();
        int[][] shifts = CommonFunctions.create2DArray(n, m);
        String result = shiftingLetters(s, shifts);
        System.out.println(result);
    }

    private static String shiftingLetters(String s, int[][] shifts) {
        int size = shifts.length;
        char[] chars = s.toCharArray();
        for (int[] shift : shifts) {
            for (int j = shift[0]; j <= shift[1]; j++) {
                int ch = shift[2];
                if (ch == 1) {
                    if (chars[j] == 'z') {
                        chars[j] = 'a';
                    } else {
                        chars[j]++;
                    }
                } else {
                    if (chars[j] == 'a') {
                        chars[j] = 'z';
                    } else {
                        chars[j]--;
                    }
                }
            }
        }
        StringBuilder sBuilder = new StringBuilder();
        for (char aChar : chars) {
            sBuilder.append(aChar);
        }
        s = sBuilder.toString();
        return s;
    }

    /*private static String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] diff = new int[n + 1]; // Difference array to track shifts

        // Step 1: Apply the range shifts in the difference array
        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2] == 1 ? 1 : -1;

            diff[start] += direction;
            if (end + 1 < n) {
                diff[end + 1] -= direction;
            }
        }

        // Step 2: Calculate the prefix sum for net shifts
        int netShift = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < n; i++) {
            netShift = (netShift + diff[i]) % 26; // Ensure within alphabet range
            if (netShift < 0) netShift += 26; // Handle negative shifts

            // Apply the net shift to the character
            chars[i] = (char) ((chars[i] - 'a' + netShift) % 26 + 'a');
        }

        return new String(chars);
    }*/

}
