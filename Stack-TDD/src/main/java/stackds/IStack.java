package stackds;

public interface IStack<T extends Object> {
    void push(T item);
    T pop();
    T getTop();
    boolean isEmpty();
    boolean isFull();
    int getNumberElementsInStack();
}
