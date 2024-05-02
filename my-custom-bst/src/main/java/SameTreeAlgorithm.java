import java.util.Objects;

public class SameTreeAlgorithm {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */

    //Checking if two different tree are the same
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }

        if (p != null && q == null || p == null || p.val != q.val) {
            return false;
        }

        boolean subtree1 = isSameTree(p.left, q.left);
        boolean subtree2 = isSameTree(p.right, q.right);
        return subtree1 && subtree2;
    }

}
