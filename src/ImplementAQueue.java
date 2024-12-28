import commonFunctions.QueueUsingArray;

public class ImplementAQueue {
    public static void main(String[] args) {
        QueueUsingArray queueUsingArray = new QueueUsingArray();
        queueUsingArray.enqueue(17);
        queueUsingArray.enqueue(23);
        queueUsingArray.enqueue(11);
        System.out.println(queueUsingArray.dequeue());
        System.out.println(queueUsingArray.front());
        System.out.println(queueUsingArray.dequeue());
        System.out.println(queueUsingArray.front());
        System.out.println(queueUsingArray.isEmpty());
        System.out.println(queueUsingArray.dequeue());
        System.out.println(queueUsingArray.dequeue());
    }
}
