import commonFunctions.LinkedListFunctions;
import commonFunctions.Node;

import java.util.ArrayList;

public class SegregateOddEven {
    public static void main(String[] args) {
        Node<Integer> head = LinkedListFunctions.createIntegerLinkedList();
        Node<Integer> newHead = segregateOddEven(head);
        LinkedListFunctions.printIntegerLinkedList(newHead);
    }

    private static Node<Integer> segregateOddEven(Node<Integer> head) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Node<Integer> temp = head;
        while (temp != null) {
            if (temp.data % 2 != 0)
                arrayList.add(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (temp.data % 2 == 0)
                arrayList.add(temp.data);
            temp = temp.next;
        }
        Node<Integer> newHead = new Node<>(arrayList.get(0));
        temp = newHead;
        for (int i = 1; i < arrayList.size(); i++) {
            temp.next = new Node<>(arrayList.get(i));
            temp = temp.next;
        }
        return newHead;
    }
}
