import exceptions.EmptyArrayException;
import exceptions.NotFoundKey;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BstTest {

    @Test
    @DisplayName("searching 1 in 3 items array")
    void checkTreeThreeElementsStack() throws EmptyArrayException, NotFoundKey {
        int index = Bst.search(new int[] {1,2,3}, 1);
        assertEquals(0, index, String.format("Key %s should be in index %s", 1, 0));
    }

    @Test
    @DisplayName("searching 10 in 10 items array")
    void checkTenElementsStack() throws EmptyArrayException, NotFoundKey {
        int index = Bst.search(new int[] {1,2,3,4,5,6,7,8,9,10}, 10);
        assertEquals(9, index, String.format("Key %s should be in index %s", 10, 9));
    }

    @Test
    @DisplayName("searching 1 in 1 item array")
    void checkOneElementArrayOfOne() throws EmptyArrayException, NotFoundKey {
        int index = Bst.search(new int[] {1}, 1);
        assertEquals(0, index, String.format("Key %s should be in index %s", 10, 9));
    }

    @Test
    @DisplayName("Not Found Key Item")
    void checkOneElement() throws NotFoundKey {
        Assertions.assertThrows(NotFoundKey.class, () -> {
            Bst.search(new int[] {1}, 12);
        });
    }

    @Test
    @DisplayName("Array for searching is empty")
    void checkEmptyArray() {
        Assertions.assertThrows(EmptyArrayException.class, () -> {
            Bst.search(new int[] {}, 1);
        });
    }

}
