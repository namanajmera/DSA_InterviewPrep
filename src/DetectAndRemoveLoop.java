import commonFunctions.CommonFunctions;
import commonFunctions.LinkedListFunctions;
import commonFunctions.Node;

import java.util.HashMap;

public class DetectAndRemoveLoop {
    public static void main(String[] args) {
        Node<Integer> head = LinkedListFunctions.createIntegerLinkedList();
        Node<Integer> newHead = removeLoop(head);
        Node<Integer> newHead2 = removeLoop2(head);
        LinkedListFunctions.printIntegerLinkedList(newHead);
        LinkedListFunctions.printIntegerLinkedList(newHead2);
    }

    private static Node<Integer> removeLoop2(Node<Integer> head) {
        HashMap<Node<Integer>, Integer> hashMap = new HashMap<>();
        Node<Integer> temp = head.next;
        hashMap.put(head, 1);
        while (temp != null) {
            if (hashMap.containsKey(temp.next)) {
                temp.next = null;
                break;
            } else {
                hashMap.put(temp, 1);
            }
            temp = temp.next;
        }
        return head;
    }

    private static Node<Integer> removeLoop(Node<Integer> head) {
        // Write your code here.
        if (head == null || head.next == null) {
            return head;
        }

        Node<Integer> slow = head;
        Node<Integer> fast = head;
        Node<Integer> prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
            if (slow == null || fast == null) {
                return head;
            }
            if (slow == fast) {
                break;
            }
        }
        Node<Integer> temp = head;
        while (temp != slow) {
            prev = slow;
            temp = temp.next;
            slow = slow.next;
        }
        prev.next = null;
        return head;
    }
}
