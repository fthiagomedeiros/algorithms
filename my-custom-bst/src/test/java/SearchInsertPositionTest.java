import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchInsertPositionTest {

    @Test
    void searchInsert() {
        SearchInsertPosition s = new SearchInsertPosition();

        int[] input = new int[] {1,3};
        int target = 2;

        int result = s.searchInsert(input, target);
        Assertions.assertEquals(1, result);
    }

    @Test
    void searchInsert2() {
        SearchInsertPosition s = new SearchInsertPosition();

        int[] input = new int[] {1,3,5};
        int target = 4;

        int result = s.searchInsert(input, target);
        Assertions.assertEquals(2, result);
    }
}