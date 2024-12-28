import commonFunctions.StackUsingQueue;

public class StackUsingTwoQueue {
    public static void main(String[] args) {
        StackUsingQueue stackUsingQueue = new StackUsingQueue();
        stackUsingQueue.push(13);
        stackUsingQueue.push(47);
        System.out.println(stackUsingQueue.getSize());
        System.out.println(stackUsingQueue.isEmpty());
        System.out.println(stackUsingQueue.pop());
        System.out.println(stackUsingQueue.top());
    }
}
