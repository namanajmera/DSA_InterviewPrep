import commonFunctions.CommonFunctions;

import java.util.Stack;

public class ClearDigits {
    public static void main(String[] args) {
        String str = CommonFunctions.getString();
        String result = clearDigits(str);
        System.out.println(result);
    }

    private static String clearDigits(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                stack.add(str.charAt(i));
            } else {
                if (!stack.isEmpty())
                    stack.pop();
            }
        }
        if (stack.isEmpty())
            return "";
        String result = "";
        while (!stack.isEmpty()) {
            result = stack.pop() + result;
        }
        return result;
    }
}
