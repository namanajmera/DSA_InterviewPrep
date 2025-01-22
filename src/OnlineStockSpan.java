import commonFunctions.CommonFunctions;

import java.util.ArrayList;
import java.util.Stack;

public class OnlineStockSpan {
    public static void main(String[] args) {
        int size = CommonFunctions.getInt();
        ArrayList<Integer> arrayList = CommonFunctions.create1DArrayList(size);
        ArrayList<Integer> result = findSpans(arrayList);
        System.out.println(result);
    }

    private static ArrayList<Integer> findSpans(ArrayList<Integer> arrayList) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arrayList.size(); i++) {
            while (!stack.isEmpty() && arrayList.get(i) >= arrayList.get(stack.peek())) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result.add(i + 1);
            } else {
                result.add(i - stack.peek());
            }
            stack.push(i);
        }
        return result;
    }
}
