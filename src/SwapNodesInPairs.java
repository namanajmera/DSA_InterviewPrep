import commonFunctions.LinkedListFunctions;
import commonFunctions.Node;

public class SwapNodesInPairs {
    public static void main(String[] args) {
        Node<Integer> head = LinkedListFunctions.createIntegerLinkedList();
        Node<Integer> newHead = pairsSwap(head);
        LinkedListFunctions.printIntegerLinkedList(newHead);
    }

    private static Node<Integer> pairsSwap(Node<Integer> head) {
        if (head == null || head.next == null)
            return head;
        Node<Integer> prev = head;
        Node<Integer> currentNode = head.next;
        head = currentNode;
        while (true) {
            Node<Integer> next = currentNode.next;
            currentNode.next = prev;
            if (next == null || next.next == null) {
                prev.next = next;
                break;
            }
            prev.next = next.next;
            prev = next;
            currentNode = prev.next;
        }
        return head;
    }
}
