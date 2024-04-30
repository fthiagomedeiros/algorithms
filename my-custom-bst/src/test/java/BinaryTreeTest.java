import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
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

    @Test
    void shouldInsertListValue() {
        binaryTree.insert(List.of(10, 20, 30, 11, 5));

        assertTrue(binaryTree.hasData(11));
        assertFalse(binaryTree.hasData(55));
        assertFalse(binaryTree.hasData(99));
    }


}