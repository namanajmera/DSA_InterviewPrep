package commonFunctions;

import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> stk1, stk2;

    public QueueUsingStacks() {
        stk1 = new Stack<>();
        stk2 = new Stack<>();
    }

    // Enqueues 'X' into the queue. Returns true after enqueuing.
    public boolean enqueue(int x) {
        stk1.add(x);
        return true;
    }

    /*
       Dequeues top element from queue. Returns -1 if the queue is empty,
       otherwise returns the popped element.
    */
    public int dequeue() {
        int value = -1;
        while (!stk1.isEmpty()) {
            stk2.add(stk1.pop());
        }
        if (!stk2.isEmpty()) {
            value = stk2.pop();
        }
        while (!stk2.isEmpty()) {
            stk1.add(stk2.pop());
        }
        return value;
    }
}
