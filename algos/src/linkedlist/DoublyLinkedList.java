package linkedlist;

public class DoublyLinkedList {
    private DoublyLinkedNode<Integer> head;

    public void insertAtHead(Integer data) {
        DoublyLinkedNode<Integer> newNode = new DoublyLinkedNode<>(data);
        newNode.setNextNode(this.head);

        if (this.head != null) {
            this.head.setPrevNode(newNode);
        }
        this.head = newNode;
    }


    public int length() {
        int length = 0;
        DoublyLinkedNode<Integer> current = this.head;
        while (current != null) {
            length++;
            current = current.getNextNode();
        }
        return length;
    }

    public void sort() {
        DoublyLinkedNode<Integer> current = this.head;

        while (current != null) {
            DoublyLinkedNode<Integer> prevNode = current.getPrevNode();
            while (prevNode != null && (prevNode.getData() > current.getData())) {
                prevNode = prevNode.getPrevNode();
            }

            DoublyLinkedNode<Integer> nextNode = current.getNextNode();
            if (prevNode != null || current != this.head) {
                current.getPrevNode().setNextNode(nextNode);
                if (nextNode != null) {
                    nextNode.setPrevNode(current.getPrevNode());
                }
                current.setPrevNode(prevNode);
            }
            if (prevNode == null) {
               if (current != this.head) {
                   current.setNextNode(this.head);
                    current.getNextNode().setPrevNode(current);
                    this.head = current;
               }
            } else {
                current.setNextNode(prevNode.getNextNode());
                prevNode.getNextNode().setPrevNode(current);
                prevNode.setNextNode(current);
            }
            current = nextNode;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        DoublyLinkedNode<Integer> n = this.head;
        sb.append('{');
        while (n != null) {
            sb.append(n);
            sb.append(", ");
            n = n.getNextNode();
        }
        sb.append('}');
        return sb.toString();
    }
}
