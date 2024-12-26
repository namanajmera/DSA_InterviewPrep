import commonFunctions.StackUsingLinkedList;

public class ImplementStackWithLinkedList {
    public static void main(String[] args) {
        StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();
        stackUsingLinkedList.push(5);
        stackUsingLinkedList.push(2);
        stackUsingLinkedList.push(3);
        stackUsingLinkedList.push(4);
        stackUsingLinkedList.push(5);
        System.out.println(stackUsingLinkedList.getSize());
        System.out.println(stackUsingLinkedList.isEmpty());
        stackUsingLinkedList.pop();
        System.out.println(stackUsingLinkedList.getTop());
        stackUsingLinkedList.pop();
        System.out.println(stackUsingLinkedList.getTop());
        stackUsingLinkedList.pop();
        System.out.println(stackUsingLinkedList.getTop());
        System.out.println(stackUsingLinkedList.getSize());
        System.out.println(stackUsingLinkedList.isEmpty());
        stackUsingLinkedList.pop();
        System.out.println(stackUsingLinkedList.getTop());
        System.out.println(stackUsingLinkedList.getSize());
        stackUsingLinkedList.pop();
        System.out.println(stackUsingLinkedList.isEmpty());
    }
}
