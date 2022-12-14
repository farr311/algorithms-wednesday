package lesson8.customStack;

public class Stack {

    private static final int DEFAULT_CAPACITY = 8;
    private int[] arr = new int[DEFAULT_CAPACITY];
    private int capacity = DEFAULT_CAPACITY;
    private int size = 0;

    public void push(int value) {
        if (capacity <= size) {
            // growSize();
        } else {
            arr[size++] = value;
        }
    }

    public int pop() {
        int value = arr[size - 1];
        arr[--size] = 0;
        return value;
    }

    public int peek() {
        return arr[size - 1];
    }
}
