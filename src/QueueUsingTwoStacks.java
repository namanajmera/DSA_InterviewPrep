import commonFunctions.QueueUsingStacks;

public class QueueUsingTwoStacks {
    public static void main(String[] args) {
        QueueUsingStacks queueUsingStacks = new QueueUsingStacks();
        System.out.println(queueUsingStacks.enqueue(2));
        System.out.println(queueUsingStacks.enqueue(3));
        System.out.println(queueUsingStacks.dequeue());
        System.out.println(queueUsingStacks.enqueue(4));
        System.out.println(queueUsingStacks.enqueue(6));
        System.out.println(queueUsingStacks.enqueue(7));
        System.out.println(queueUsingStacks.dequeue());
    }
}
