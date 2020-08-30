import ds.BasicQueue;
import ds.IQueue;
import ds.exceptions.QueueIsEmptyException;
import ds.exceptions.QueueIsFullException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTests {

    private static final int BASIC_QUEUE_MAX_CAPACITY = 10;

    @Test
    @DisplayName("No items in the queue")
    void checkEmptyQueue() throws QueueIsEmptyException {
        IQueue<String> queue = new BasicQueue<>();
        assertEquals(0, queue.size(), "The queue must have no items");
    }

    @Test
    @DisplayName("Inserting two items in the queue")
    void checkOneItemInQueue() throws QueueIsEmptyException, QueueIsFullException {
        IQueue<String> queue = new BasicQueue<>();
        queue.enqueue("first_item");
        assertEquals(1, queue.size(), "The queue must have only one items");
    }

    @Test
    @DisplayName("Inserting maximum limit items in the queue")
    void checkMaxNumberItemsInQueue() throws QueueIsFullException {
        IQueue<String> queue = new BasicQueue<>();

        for (int i = 0; i < BASIC_QUEUE_MAX_CAPACITY; i++) {
            queue.enqueue(String.format("first %s", i));
        }

        assertEquals(10, queue.size(), "The queue must have ten items");
    }

    @Test
    @DisplayName("Reaching limit of the queue")
    void whenMaximumCapacityExceptionThrown_thenExpectationSatisfied() {
        IQueue<String> queue = new BasicQueue<>();

        QueueIsFullException exception = assertThrows(QueueIsFullException.class, () -> {
            for (int i = 0; i < BASIC_QUEUE_MAX_CAPACITY + 1; i++) {
                queue.enqueue(String.format("first %s", i));
            }
        });

        String expectedMessage = "The queue is full";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

}
