package commonFunctions;

public class StackUsingLinkedList {
    Node<Integer> head;
    Node<Integer> top;
    int size;

    public StackUsingLinkedList() {
        //Write your code here
        this.head = null;
        this.top = null;
        this.size = 0;
    }

    public int getSize() {
        //Write your code here
        return size;
    }

    public boolean isEmpty() {
        //Write your code here
        return size == 0;
    }

    public void push(int data) {
        //Write your code here
        if (size == 0) {
            head = new Node<>(data);
            top = head;
            size++;
        } else if (size > 0) {
            Node<Integer> newNode = new Node<>(data);
            Node<Integer> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            top = temp.next;
            size++;
        }
    }

    public void pop() {
        //Write your code here
        if (size == 1) {
            head = null;
            size--;
        } else if (size > 1) {
            Node<Integer> temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            top = temp;
            temp.next = null;
            size--;
        }
    }

    public int getTop() {
        //Write your code here
        return top.data;
    }
}
