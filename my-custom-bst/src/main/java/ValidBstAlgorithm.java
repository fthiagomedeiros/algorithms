
public class ValidBstAlgorithm {

    public boolean isValidBST(TreeNode root) {
        return true;
    }

//    public boolean isValidBST(TreeNode root) {
//        return isValidBST(root, root, 0);
//    }

//    private boolean isValidBST(TreeNode root, TreeNode mainRoot, int position) {
//        int leftPos = 1;
//        int rightPos = 2;
//
//        TreeNode left = root.left;
//        TreeNode right = root.right;
//
//        if (left == null && right == null) {
//            return true;
//        }
//
//        if (left == null) {
//            if (right.val <= root.val) {
//                return false;
//            }
//            return true;
//        } else if (right == null) {
//            if (left.val >= root.val) {
//                return false;
//            }
//            return true;
//        }
//
//        if ((left != null && left.val >= root.val) || (right != null && right.val <= root.val)) {
//            return false;
//        }
//
//        if (position == leftPos && (left != null && left.val >= mainRoot.val || (right != null && right.val >= mainRoot.val))) {
//            return false;
//        } else if (position == rightPos && left.val <= mainRoot.val) {
//            return false;
//        }
//
//        boolean checkLeft = isValidBST(left, root, leftPos); //left subtree
//        boolean checkRight = isValidBST(right, root, rightPos); //right subtree
//        return checkLeft && checkRight;
//    }

    /**
    class Solution {
        public boolean isValidBST(TreeNode root) {
            return isValidBST(root, root, 0);
        }

        private boolean isValidBST(TreeNode root, TreeNode mainRoot, int position) {
            int leftPos = 1;
            int rightPos = 2;

            TreeNode left = root.left;
            TreeNode right = root.right;

            if (left == null && right == null) {
                return true;
            }

            if (left == null) {
                if (right.val <= root.val) {
                    return false;
                }
                return true;
            } else if (right == null) {
                if (left.val >= root.val) {
                    return false;
                }
                return true;
            }

            if ((left != null && left.val >= root.val) || (right != null && right.val <= root.val)) {
                return false;
            }

            if (position == leftPos && (left != null && left.val >= mainRoot.val || (right != null && right.val >= mainRoot.val))) {
                return false;
            } else if (position == rightPos && left.val <= mainRoot.val) {
                return false;
            }

            boolean checkLeft = isValidBST(left, root, leftPos); //left subtree
            boolean checkRight = isValidBST(right, root, rightPos); //right subtree
            return checkLeft && checkRight;
        }
    }
     */

}
