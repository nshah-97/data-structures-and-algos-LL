package linkedlist;

public class DoubleEndedLinkedList {
    private Node head;
    private Node tail;

    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        }

        if (this.tail != null) {
            this.tail.setNextNode(newNode);
        }
            this.tail = newNode;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("{");
        Node current = this.head;
        while (current != null) {
            result.append(current.toString()).append(',');
            current = current.getNextNode();
        }
        result.append("}");
        return result.toString();
    }

}
