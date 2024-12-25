import commonFunctions.LinkedListFunctions;
import commonFunctions.Node;

public class MergeSortLinkedList {
    public static void main(String[] args) {
        Node<Integer> head = LinkedListFunctions.createIntegerLinkedList();
        Node<Integer> newHead = mergeSort(head);
        LinkedListFunctions.printIntegerLinkedList(newHead);
    }

    private static Node<Integer> mergeSort(Node<Integer> head) {
        if (head == null || head.next == null)
            return head;
        Node<Integer> second = split(head);
        head = mergeSort(head);
        second = mergeSort(second);
        return merge(head, second);
    }

    private static Node<Integer> merge(Node<Integer> first, Node<Integer> second) {
        if (first == null)
            return second;
        if (second == null)
            return first;
        if (first.data < second.data) {
            first.next = merge(first.next, second);
            return first;
        } else {
            second.next = merge(first, second.next);
            return second;
        }
    }

    private static Node<Integer> split(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            if (fast != null) {
                slow = slow.next;
            }
        }
        Node<Integer> temp = slow.next;
        slow.next = null;
        return temp;
    }
}
