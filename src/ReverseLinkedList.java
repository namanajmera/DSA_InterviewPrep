import commonFunctions.LinkedListFunctions;
import commonFunctions.Node;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node<Integer> head = LinkedListFunctions.createIntegerLinkedList();
        LinkedListFunctions.printIntegerLinkedList(head);
        Node<Integer> newHead = reverseLinkedList(head);
        System.out.println();
        LinkedListFunctions.printIntegerLinkedList(newHead);
    }

    private static Node<Integer> reverseLinkedList(Node<Integer> head) {
        if (head == null || head.next == null)
            return head;
        Node<Integer> currentNode = head;
        Node<Integer> prev = null;
        while (currentNode != null) {
            Node<Integer> temp = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = temp;
        }
        return prev;
    }
}
