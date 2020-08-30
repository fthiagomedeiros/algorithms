package ds.exceptions;

public class QueueIsEmptyException extends Throwable {
    public QueueIsEmptyException(String message) {
        super(message);
    }

    public QueueIsEmptyException() {
        this("The queue is empty");
    }
}
