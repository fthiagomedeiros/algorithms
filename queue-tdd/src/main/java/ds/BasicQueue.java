package ds;

import ds.exceptions.QueueIsFullException;

public class BasicQueue<T> implements IQueue<T> {

    private static final int MAXIMUM_CAPACITY = 10;

    private T[] data;
    private int start = -1;
    private int end = -1;

    @SuppressWarnings("unchecked")
    public BasicQueue() {
        this.data = (T[]) new Object[10];
    }

    @Override
    public void enqueue(T item) throws QueueIsFullException {
        if (size() == MAXIMUM_CAPACITY) {
            throw new QueueIsFullException();
        }
        if (size() == 0) {
            start = 0;
            end = 0;
            data[start] = item;
        } else {
            end++;
            data[end] = item;
        }

    }

    @Override
    public T dequeue() {
        return null;
    }

    @Override
    public int size() {
        if (start == -1 && end == -1) {
            return 0;
        }
        return (end - start) + 1;
    }
}
