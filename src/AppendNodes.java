import commonFunctions.CommonFunctions;
import commonFunctions.LinkedListFunctions;
import commonFunctions.Node;

public class AppendNodes {
    public static void main(String[] args) {
        Node<Integer> head = LinkedListFunctions.createIntegerLinkedList();
        int n = CommonFunctions.getInt();
        int m = CommonFunctions.getInt();
        Node<Integer> newHead = addNodes(head, n, m);
        LinkedListFunctions.printIntegerLinkedList(newHead);
    }

    private static Node<Integer> addNodes(Node<Integer> head, int n, int m) {
        Node<Integer> temp = head;
        while (temp == null || temp.next != null) {
            int i = 0;
            while (i < m && temp != null) {
                i++;
                temp = temp.next;
            }
            if (temp == null)
                break;
            int sum = temp.data, j = 1;
            while (j < n && temp.next != null) {
                j++;
                temp = temp.next;
                sum += temp.data;
            }
            Node<Integer> next = temp.next;
            temp.next = new Node<>(sum);
            temp = temp.next;
            temp.next = next;
            temp = temp.next;
        }
        return head;
    }
}
