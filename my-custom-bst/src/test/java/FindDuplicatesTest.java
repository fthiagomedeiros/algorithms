import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindDuplicatesTest {

    @Test
    void findDuplicate() {
//    [1,3,4,2,2] output 2

        FindDuplicates f = new FindDuplicates();
        int result = f.findDuplicate(new int[]{1, 3, 4, 2, 2});
        assertEquals(2, result);
    }

}