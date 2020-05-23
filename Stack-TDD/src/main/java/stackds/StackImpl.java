package stackds;

public class StackImpl<T> implements IStack<T> {

    private static final int INITIAL_CAPACITY = 10;

    private final T[] items;
    private int currentPosition;

    @SuppressWarnings("unchecked")
    public StackImpl() {
        items = (T[]) new Object[INITIAL_CAPACITY];
        currentPosition = 0;
    }

    @Override
    public void push(T item) {
        items[currentPosition] = item;
        currentPosition++;
    }

    @Override
    public T pop() {
        T value;
        currentPosition--;
        value = items[currentPosition];
        return value;
    }

    @Override
    public T getTop() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return currentPosition == 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int getNumberElementsInStack() {
        return currentPosition;
    }
}
