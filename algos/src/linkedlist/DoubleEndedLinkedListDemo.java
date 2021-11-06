package linkedlist;

public class DoubleEndedLinkedListDemo {
    public static void main(String[] args) {
        SortedLinkedList list = new SortedLinkedList();
        list.insert(132);
        list.insert(45);
        list.insert(82);
        list.insert(21);
        list.insert(6);

        System.out.println(list);
    }
}
