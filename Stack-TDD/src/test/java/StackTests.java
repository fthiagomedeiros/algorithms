import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import stackds.IStack;
import stackds.StackImpl;

import static org.junit.jupiter.api.Assertions.*;

public class StackTests {

    @Test
    @DisplayName("No items pushed")
    void checkEmptyStack() {
        IStack<Integer> stack = new StackImpl<>();
        assertTrue(stack.isEmpty(), "Empty should be true");
    }

    @Test
    @DisplayName("1 item pushed")
    void checkOneElementPushed() {
        IStack<Integer> stack = new StackImpl<>();
        stack.push(1);
        assertFalse(stack.isEmpty(), "Empty should be false");
    }

    @Test
    @DisplayName("1 item pushed")
    void insertItemAndPopItem() {
        IStack<Integer> stack = new StackImpl<>();
        stack.push(1);
        int value = stack.pop();
        assertEquals(1, value, "The value must be 1");
        assertTrue(stack.isEmpty(), "Empty should be false");
    }
}
