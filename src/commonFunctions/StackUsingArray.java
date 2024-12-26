package commonFunctions;

public class StackUsingArray {
    int[] arr;
    int currentSize;

    public StackUsingArray(int capacity) {
        // Write your code here.
        this.arr = new int[capacity];
        this.currentSize = -1;
    }

    public void push(int num) {
        // Write your code here.
        if (currentSize != arr.length) {
            arr[++currentSize] = num;
        }
    }

    public int pop() {
        // Write your code here.
        if (currentSize == -1) {
            return -1;
        }
        int value = arr[currentSize];
        currentSize--;
        return value;
    }

    public int top() {
        // Write your code here.
        if (currentSize == -1) {
            return -1;
        }
        return arr[currentSize];
    }

    public int isEmpty() {
        // Write your code here.
        return currentSize == -1 ? 1 : 0;
    }

    public int isFull() {
        // Write your code here.
        return currentSize == arr.length - 1 ? 1 : 0;
    }
}
