import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinaryTreeCountNodesTest {

    private BinaryTree b;

    @BeforeEach
    public void setUp() {
        b = new BinaryTree();
    }

    @Test
    void shouldTestCaseBase() {
        BinaryTreeCountNodes c = new BinaryTreeCountNodes();
        int noNodes = c.countNodes(b.getRoot());
        assertEquals(0, noNodes);
    }

    @Test
    void shouldTestCaseBaseWithSingleItem() {
        BinaryTreeCountNodes c = new BinaryTreeCountNodes();
        b.insert(10);
        int noNodes = c.countNodes(b.getRoot());
        assertEquals(1, noNodes);
    }

    @Test
    void shouldTestCaseBaseCompleteTree() {
        BinaryTreeCountNodes c = new BinaryTreeCountNodes();
        b.insert(10);
        b.insert(5);
        b.insert(11);
        int noNodes = c.countNodes(b.getRoot());
        assertEquals(3, noNodes);
    }

    @Test
    void shouldTestCaseCompleteTreeSampleContest() {
        BinaryTreeCountNodes c = new BinaryTreeCountNodes();
        b.insert(10);
        b.insert(5);
        b.insert(12);
        b.insert(13);
        b.insert(11);
        b.insert(4);
        b.insert(7);
        int noNodes = c.countNodes(b.getRoot());
        assertEquals(7, noNodes);
    }
}