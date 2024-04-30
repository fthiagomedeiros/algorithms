import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinaryTreeTest {

    private BinaryTree binaryTree;
    private BinaryTree secondBinaryTree;

    @BeforeEach
    void setUp() {
        binaryTree = new BinaryTree();
        secondBinaryTree = new BinaryTree();
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

    @Test
    void shouldValidateSameTree() {
        binaryTree.insert(List.of(10, 20, 30, 11, 5));
        secondBinaryTree.insert(List.of(10, 20, 30, 11, 5));

        SameTreeAlgorithm alg = new SameTreeAlgorithm();
        boolean result = alg.isSameTree(binaryTree.getRoot(), secondBinaryTree.getRoot());
        assertTrue(result);

    }

    @Test
    void shouldValidateSameTree2() {
        binaryTree.insert(List.of(10));
        secondBinaryTree.insert(List.of(10));

        SameTreeAlgorithm alg = new SameTreeAlgorithm();
        boolean result = alg.isSameTree(binaryTree.getRoot(), secondBinaryTree.getRoot());
        assertTrue(result);

    }

    @Test
    void shouldBeFalse() {
        binaryTree.insert(List.of(1));
        secondBinaryTree.insert(List.of(10));

        SameTreeAlgorithm alg = new SameTreeAlgorithm();
        boolean result = alg.isSameTree(binaryTree.getRoot(), secondBinaryTree.getRoot());
        assertFalse(result);

    }

    @Test
    void shouldTest3() {
        binaryTree.insert(List.of(10, 1, 11));
        secondBinaryTree.insert(List.of(10, 1, 11));

        SameTreeAlgorithm alg = new SameTreeAlgorithm();
        boolean result = alg.isSameTree(binaryTree.getRoot(), secondBinaryTree.getRoot());
        assertTrue(result);

    }

    @Test
    void shouldTest4() {
        binaryTree.insert(List.of(10, 20, 30, 11, 5));
        secondBinaryTree.insert(List.of(10, 20, 30, 11, 5, 7));

        SameTreeAlgorithm alg = new SameTreeAlgorithm();
        boolean result = alg.isSameTree(binaryTree.getRoot(), secondBinaryTree.getRoot());
        assertFalse(result);

    }

    @Test
    void checkBstValidity1() {
        BinaryTree b = secondBinaryTree;
        b.insert(5);
        b.insert(1);
        b.insertWrong(4);
        b.insertWrong(3);

        ValidBstAlgorithm alg = new ValidBstAlgorithm();
        boolean result = alg.isValidBST(secondBinaryTree.getRoot());
        assertFalse(result);

    }

    @Test
    void checkBstValidity2() {
        binaryTree.insert(List.of(10, 20, 30, 11, 5, 6));

        ValidBstAlgorithm alg = new ValidBstAlgorithm();
        boolean result = alg.isValidBST(binaryTree.getRoot());
        assertTrue(result);

    }

    @Test
    void checkBstValidity3() {
        binaryTree.insert(List.of(5,4,6,7));
        TreeNode node = binaryTree.fetchNode(6);
        node.left = new TreeNode(null, null, 3);

        ValidBstAlgorithm alg = new ValidBstAlgorithm();
        boolean result = alg.isValidBST(binaryTree.getRoot());
        assertTrue(result);

    }



}