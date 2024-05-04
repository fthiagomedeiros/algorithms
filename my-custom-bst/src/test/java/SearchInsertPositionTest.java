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

    @Test
    void searchInsertRange1() {
        SearchInsertPosition s = new SearchInsertPosition();

        int[] input = new int[] {2,2};
        int target = 2;

        int[] result = s.searchRange(input, target);
        Assertions.assertEquals(new int[] {0,1}, result);
    }

    @Test
    void searchInsertRange2() {
        SearchInsertPosition s = new SearchInsertPosition();

        int[] input = new int[] {1,4};
        int target = 4;

        int[] result = s.searchRange(input, target);
        Assertions.assertEquals(new int[] {1,1}, result);
    }

    @Test
    void searchInsertRange3() {
        SearchInsertPosition s = new SearchInsertPosition();

        int[] input = new int[] {1,1,2};
        int target = 1;

        int[] result = s.searchRange(input, target);
        Assertions.assertEquals(new int[] {0,1}, result);
    }
}