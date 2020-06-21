import exceptions.EmptyArrayException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BstTest {

    @Test
    @DisplayName("Three items BST")
    void checkTreeThreeElementsStack() throws EmptyArrayException {
        int index = Bst.search(new int[] {1,2,3}, 1);
        assertEquals(0, index, "Empty should be true");
    }

    @Test
    @DisplayName("EmptyArrayException Thrown")
    void checkEmptyArray() {
        Assertions.assertThrows(EmptyArrayException.class, () -> {
            Bst.search(new int[] {}, 1);
        });

    }

}
