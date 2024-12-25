import commonFunctions.CommonFunctions;
import commonFunctions.LinkedListFunctions;
import commonFunctions.Node;

public class DeleteKthNodeFromEnd {
    public static void main(String[] args) {
        Node<Integer> head = LinkedListFunctions.createIntegerLinkedList();
        int k = CommonFunctions.getInt();
        Node<Integer> newHead = removeKthNode(head, k);
        LinkedListFunctions.printIntegerLinkedList(newHead);
    }

    private static Node<Integer> removeKthNode(Node<Integer> head, int k) {
        int length = lengthOfLinkedList(head);
        int index = length - k;
        int i = 0;
        Node<Integer> temp = head;
        if (index == 0) {
            return head.next;
        }
        while (temp != null) {
            if (i == (index - 1)) {
                temp.next = temp.next.next;
                break;
            } else {
                temp = temp.next;
            }
            i++;
        }
        return head;
    }

    private static int lengthOfLinkedList(Node<Integer> head) {
        int length = 0;
        Node<Integer> temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }
}
