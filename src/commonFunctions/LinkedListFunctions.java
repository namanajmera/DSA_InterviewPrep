package commonFunctions;

public class LinkedListFunctions {
    public static Node<Integer> createIntegerLinkedList() {
        int value = CommonFunctions.getInt();
        Node<Integer> head = new Node<>(value);
        Node<Integer> currentNode = head;
        value = CommonFunctions.getInt();
        while (value != -1) {
            Node<Integer> newNode = new Node<>(value);
            currentNode.next = newNode;
            currentNode = newNode;
            value = CommonFunctions.getInt();
        }
        return head;
    }

    public static void printIntegerLinkedList(Node<Integer> head) {
        Node<Integer> currentNode = head;
        while (currentNode!=null){
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.next;
        }
    }
}
