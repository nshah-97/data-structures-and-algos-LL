package linkedlist;

public class SortedLinkedList {
    private Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            this.head = newNode;
            return;
        }

        if (head.getData() > data) {
            newNode.setNextNode(head);
            this.head = newNode;
            return;
        }

        Node current = head;
        while (current.getNextNode().getData() < data) {
            current = current.getNextNode();
        }
        newNode.setNextNode(current.getNextNode());
        current.setNextNode(newNode);
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
}
