import exceptions.EmptyArrayException;
import exceptions.NotFoundKey;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BstTest {

    @Test
    @DisplayName("Three items BST")
    void checkTreeThreeElementsStack() throws EmptyArrayException, NotFoundKey {
        int index = Bst.search(new int[] {1,2,3}, 1);
        assertEquals(0, index, "Empty should be true");
    }

    @Test
    @DisplayName("Ten items BST")
    void checkTenElementsStack() throws EmptyArrayException, NotFoundKey {
        int index = Bst.search(new int[] {1,2,3,4,5,6,7,8,9,10}, 10);
        assertEquals(9, index, "Empty should be true");
    }

    @Test
    @DisplayName("Not Found Item")
    void checkOneElement() throws NotFoundKey {
        Assertions.assertThrows(NotFoundKey.class, () -> {
            Bst.search(new int[] {1}, 12);
        });
    }

    @Test
    @DisplayName("EmptyArrayException Thrown")
    void checkEmptyArray() {
        Assertions.assertThrows(EmptyArrayException.class, () -> {
            Bst.search(new int[] {}, 1);
        });
    }

}
