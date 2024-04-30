import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinaryTreeTest {

    private BinaryTree binaryTree;

    @BeforeEach
    void setUp() {
        binaryTree = new BinaryTree();
    }

    @Test
    void shouldInsertValue() {
        binaryTree.insert(10);
        binaryTree.insert(20);
        binaryTree.insert(5);
        binaryTree.insert(30);
        binaryTree.insert(11);

        assertTrue(binaryTree.hasData(11));
        assertFalse(binaryTree.hasData(55));
    }


}