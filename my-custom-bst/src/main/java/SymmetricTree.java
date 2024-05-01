
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {

        TreeNode left = root.left;
        TreeNode right = root.right;

        if (left == null && right == null) {
            return true;
        }

        if (left.val != right.val) {
            return false;
        }

        return isSymmetric(left) && isSymmetric(right);
    }

}
