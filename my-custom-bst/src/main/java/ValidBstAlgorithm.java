public class ValidBstAlgorithm {

    /**
     * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
     * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
     * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
     */

    public boolean isValidBST(TreeNode root) {

        TreeNode left = root.left;
        TreeNode right = root.right;

        if (left == null && right == null) {
            return true;
        }

        if (left == null) {
            if (right.val < root.val) {
                return false;
            }
            return true;
        } else if (right == null) {
            if (left.val > root.val) {
                return false;
            }
            return true;
        }

        if (left.val > root.val || right.val < root.val) {
            return false;
        }

        boolean checkLeft = isValidBST(left);
        boolean checkRight = isValidBST(right);
        return checkLeft && checkRight;
    }

}
