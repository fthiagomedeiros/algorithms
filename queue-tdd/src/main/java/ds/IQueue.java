package ds;

import ds.exceptions.QueueIsEmptyException;
import ds.exceptions.QueueIsFullException;

public interface IQueue<T> {
    void enqueue(T item) throws QueueIsFullException;
    T dequeue();
    int size();
}
