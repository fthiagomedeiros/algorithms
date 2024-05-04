import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchInsertPositionTest {

    @Test
    void searchCaseTwoItemsInArray() {
        SearchInsertPosition s = new SearchInsertPosition();

        int[] input = new int[]{1, 3};
        int target = 2;

        int result = s.searchInsert(input, target);
        Assertions.assertEquals(1, result);
    }

    @Test
    void searchCaseThreeItemsInArray() {
        SearchInsertPosition s = new SearchInsertPosition();

        int[] input = new int[]{1, 3, 5};
        int target = 4;

        int result = s.searchInsert(input, target);
        Assertions.assertEquals(2, result);
    }

    @Test
    void searchCaseTheSameValueInSmallArray() {
        SearchInsertPosition s = new SearchInsertPosition();

        int[] input = new int[]{2, 2};
        int target = 2;

        int[] result = s.searchRange(input, target);

        Assertions.assertEquals(0, result[0]);
        Assertions.assertEquals(1, result[1]);
    }

    @Test
    void searchInsertRange3() {
        SearchInsertPosition s = new SearchInsertPosition();

        int[] input = new int[]{1, 1, 2};
        int target = 1;

        int[] result = s.searchRange(input, target);

        Assertions.assertEquals(0, result[0]);
        Assertions.assertEquals(1, result[1]);
    }

    @Test
    void searchInsertRange333() {
        SearchInsertPosition s = new SearchInsertPosition();

        int[] input = new int[]{3, 3, 3};
        int target = 3;

        int[] result = s.searchRange(input, target);

        Assertions.assertEquals(0, result[0]);
        Assertions.assertEquals(2, result[1]);
    }

    @Test
    public void shouldValidate() {
        SearchInsertPosition s = new SearchInsertPosition();

        int[] input = new int[]{1};
        int target = 1;

        int[] result = s.searchRange(input, target);
        assertEquals(2, result.length);
    }

    @Test
    void searchInsertRange10() {
        SearchInsertPosition s = new SearchInsertPosition();

        int[] input = new int[]{1, 2, 2, 2, 2, 2, 3};
        int target = 2;

        int[] result = s.searchRange(input, target);

        Assertions.assertEquals(1, result[0]);
        Assertions.assertEquals(5, result[1]);
    }

    @Test
    void searchInsertRange11() {
        SearchInsertPosition s = new SearchInsertPosition();

        int[] input = new int[]{5, 7, 7, 8, 8, 10};
        int target = 6;

        int[] result = s.searchRange(input, target);
        Assertions.assertEquals(-1, result[0]);
        Assertions.assertEquals(-1, result[1]);
    }

}