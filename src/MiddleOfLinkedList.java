import commonFunctions.LinkedListFunctions;
import commonFunctions.Node;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        Node<Integer> head = LinkedListFunctions.createIntegerLinkedList();
        Node<Integer> newHead = findMiddle(head);
        System.out.println();
        LinkedListFunctions.printIntegerLinkedList(newHead);
    }

    private static Node<Integer> findMiddle(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast.next == null)
            return slow;
        return slow.next;
    }
}
