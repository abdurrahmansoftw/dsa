import java.util.Arrays;

public class ArrayQueue {
    private final int[] items;
    private int rear;
    private int count;
    private int front;

    public ArrayQueue(int capacity) {
        items = new int[capacity];
    }

    public void enqueue(int item) {
        if (count == items.length)
            throw new IllegalStateException();

        items[rear++] = item;
        count++;
    }

    public int dequeue() {
        var item = items[front++];
        items[front] = 0;
        count--;
        return item;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
