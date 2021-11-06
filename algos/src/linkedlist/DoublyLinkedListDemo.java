package linkedlist;

public class DoublyLinkedListDemo {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtHead(1);
        list.insertAtHead(2);
        list.insertAtHead(3);
        list.insertAtHead(4);
        list.insertAtHead(6);
        list.insertAtHead(7);
        list.insertAtHead(8);

        System.out.println("Length: " + list.length());

        System.out.println(list);
    }
}
