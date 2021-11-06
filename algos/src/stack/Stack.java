package stack;

import java.util.ArrayList;

public class Stack {
    private int topIndex = -1;
    private int[] data;
    public Stack(int maxSize) {
       data = new int[maxSize];
    }

    public void push(int number) {
        topIndex++;
        data[topIndex] = number;
    }

    public int pop() {
        int val = data[topIndex];
        data[topIndex] = 0;
        topIndex--;
        return val;
    }

    public int peek() {
        return data[topIndex];
    }
}
