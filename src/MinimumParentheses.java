import commonFunctions.CommonFunctions;

import java.util.Stack;

public class MinimumParentheses {
    public static void main(String[] args) {
        System.out.print("Enter the pattern:- ");
        String pattern = CommonFunctions.getString();
        int result = minimumParentheses(pattern);
        System.out.println(result);
    }

    private static int minimumParentheses(String pattern) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) == '(') {
                stack.push(pattern.charAt(i));
            } else {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(pattern.charAt(i));
                }
            }
        }
        return stack.size();
    }
}
