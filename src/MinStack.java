import java.util.*;

public class MinStack {
    public static void main(String[] args) {
        MinStackHelper minStackHelper = new MinStackHelper();
        minStackHelper.push(1);
        minStackHelper.push(2);
        System.out.println(minStackHelper.getMin());
        System.out.println(minStackHelper.pop());
        System.out.println(minStackHelper.top());
        System.out.println(minStackHelper.getMin());
        minStackHelper.push(13);
        System.out.println(minStackHelper.pop());
        System.out.println(minStackHelper.top());
        System.out.println(minStackHelper.getMin());
    }
}

class MinStackHelper {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    MinStackHelper() {
        // Write your code here.
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // Function to add another element equal to num at the top of stack.
    void push(int num) {
        // Write your code here.
        stack.push(num);
        if (minStack.isEmpty()|| num <= minStack.peek())
            minStack.push(num);
    }

    // Function to remove the top element of the stack.
    int pop() {
        // Write your code here.
        if (stack.isEmpty())
            return -1;
        int val = stack.peek();
        if (val == minStack.peek())
            minStack.pop();
        return stack.pop();
    }

    // Function to return the top element of stack if it is present. Otherwise
    // return -1.
    int top() {
        // Write your code here.
        if (stack.isEmpty())
            return -1;
        return stack.peek();
    }

    // Function to return minimum element of stack if it is present. Otherwise
    // return -1.
    int getMin() {
        // Write your code here.
        if (stack.isEmpty())
            return -1;
        return minStack.peek();
    }
}