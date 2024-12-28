package commonFunctions;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public StackUsingQueue() {
        // Implement the Constructor.
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    /*----------------- Public Functions of Stack -----------------*/

    public int getSize() {
        // Implement the getSize() function.
        return queue1.size();
    }

    public boolean isEmpty() {
        // Implement the isEmpty() function.
        return queue1.isEmpty();
    }

    public void push(int element) {
        // Implement the push(element) function.
        queue1.add(element);
    }

    public int pop() {
        // Implement the pop() function.
        int value = -1, size = queue1.size();
        while (!queue1.isEmpty()) {
            if (size == 1) {
                value = queue1.remove();
            } else {
                queue2.add(queue1.remove());
            }
            size--;
        }
        while (!queue2.isEmpty()) {
            queue1.add(queue2.remove());
        }
        return value;
    }

    public int top() {
        // Implement the top() function.
        int value = -1, size = queue1.size();
        while (!queue1.isEmpty()) {
            if (size == 1) {
                value = queue1.peek();
            }
            queue2.add(queue1.remove());
            size--;
        }
        while (!queue2.isEmpty()) {
            queue1.add(queue2.remove());
        }
        return value;
    }
}
