import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class BinaryTreeCountNodes {

    public int countNodes(TreeNode root) {

        if (root == null) {
            return 0;
        }

        return countNodesFromRoot(root, 1);
    }

    private int countNodesFromRoot(TreeNode root, int numberOfNodes) {

        if (root.left == null && root.right == null) {
            return numberOfNodes;
        } else if (root.left != null && root.right == null) {
            return countNodesFromRoot(root.left, numberOfNodes + 1);
        } else if (root.left == null) {
            return countNodesFromRoot(root.right, numberOfNodes + 1);
        }

        //https://leetcode.com/problems/count-complete-tree-nodes/submissions/1249455869/
        //counting items in the tree
        int left = countNodesFromRoot(root.left, ++numberOfNodes);
        int right = countNodesFromRoot(root.right, 1);

        return left + right;
    }

}
