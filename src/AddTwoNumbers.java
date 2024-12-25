import commonFunctions.LinkedListFunctions;
import commonFunctions.Node;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Node<Integer> node1 = LinkedListFunctions.createIntegerLinkedList();
        Node<Integer> node2 = LinkedListFunctions.createIntegerLinkedList();
        Node<Integer> result = addTwoNumbers(node1, node2);
        LinkedListFunctions.printIntegerLinkedList(result);
    }

    private static Node<Integer> addTwoNumbers(Node<Integer> node1, Node<Integer> node2) {
        Node<Integer> head = new Node<>(0);
        Node<Integer> temp = head;
        int carry = 0;
        while (node1 != null || node2 != null || carry != 0) {
            int total = 0;
            if (node1 != null) {
                total += node1.data;
                node1 = node1.next;
            }
            if (node2 != null) {
                total += node2.data;
                node2 = node2.next;
            }
            total += carry;
            int sum = total % 10;
            carry = total / 10;
            Node<Integer> newNode = new Node<>(sum);
            temp.next = newNode;
            temp = newNode;
        }
        return head.next;
    }
}
