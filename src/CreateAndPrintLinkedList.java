import commonFunctions.LinkedListFunctions;
import commonFunctions.Node;

public class CreateAndPrintLinkedList {
    public static void main(String[] args) {
        Node<Integer> head = LinkedListFunctions.createIntegerLinkedList();
        LinkedListFunctions.printIntegerLinkedList(head);
    }
}
