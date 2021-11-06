package queue;

public class Queue {
    private int[] queueList;
    private int maxSize;
    private int tail = -1;
    private int head = -1;
    private int numOfItems = 0;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        queueList = new int[maxSize];
    }

    public void enqueue(int number) {
        if (isFull()) throw new RuntimeException("Queue is full");
        if (tail == maxSize - 1) tail = -1;
        queueList[++tail] = number;
        numOfItems++;
    }

    public int dequeue() {
        if (isEmpty()) throw new RuntimeException("Queue is empty");
        if (head == maxSize - 1) head = -1;
        numOfItems--;
        return queueList[++head];
    }

    private boolean isFull() {
        return numOfItems == maxSize;
    }

    private boolean isEmpty() {
        return numOfItems == 0;
    }

}
