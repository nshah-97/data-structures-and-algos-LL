package linkedlist;

public class DoublyLinkedNode <T> {
    private T data;
    private DoublyLinkedNode<T> prevNode;
    private DoublyLinkedNode<T> nextNode;

    public DoublyLinkedNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DoublyLinkedNode<T> getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(DoublyLinkedNode<T> prevNode) {
        this.prevNode = prevNode;
    }

    public DoublyLinkedNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoublyLinkedNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
