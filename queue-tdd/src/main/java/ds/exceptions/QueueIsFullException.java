package ds.exceptions;

public class QueueIsFullException extends Throwable {

    public QueueIsFullException(String message) {
        super(message);
    }

    public QueueIsFullException() {
        this("The queue is full");
    }

}
