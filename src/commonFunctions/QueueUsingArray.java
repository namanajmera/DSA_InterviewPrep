package commonFunctions;


public class QueueUsingArray {
    int front;
    int rear;
    int[] queue;
    int size;

    public QueueUsingArray() {
        this.front = -1;
        this.rear = -1;
        this.queue = new int[5000];
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int data) {
        if (size == queue.length)
            return;
        if (size == 0)
            front++;
        size++;
        queue[++rear] = data;
    }

    public int dequeue() {
        if (size == 0)
            return -1;
        int pop = queue[front];
        front++;
        size--;
        if (size == 0) {
            front = -1;
            rear = -1;
        }
        return pop;
    }

    public int front() {
        if (front == -1)
            return -1;
        return queue[front];
    }
}
