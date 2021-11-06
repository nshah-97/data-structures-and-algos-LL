package linkedlist;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtHead(12);
        list.insertAtHead(36);
        list.insertAtHead(4);
        list.insertAtHead(6);
        list.insertAtHead(63);
        list.insertAtHead(45);
        list.insertAtHead(1);
        list.insertAtHead(12);
        list.deleteFromHead();

        System.out.println(list);
        System.out.println("Length: " + list.length());
        System.out.println("Found: " + list.find(15));
    }
}
