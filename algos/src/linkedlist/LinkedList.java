package linkedlist;

public class LinkedList {
    private Node head;

    public Node getHead() {
        return head;
    }

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("{");
        Node current = this.head;
        while (current != null) {
            result.append(current.toString());
            result.append(',');
            current = current.getNextNode();
        }
        result.append("}");
        return result.toString();
    }

    public int length() {
        int length = 0;
        Node current = this.head;
        while (current != null) {
            length++;
            current = current.getNextNode();
        }
        return length;
    }

    public void deleteFromHead() {
        this.head = this.head.getNextNode();
    }

    public Node find(int data) {
        Node current = this.head;
        while (current != null) {
            if (current.getData() == data) return current;
            current = current.getNextNode();
        }
        return null;
    }
}
