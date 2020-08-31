import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

    public static class TreeNode {
        private int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List < Integer > inorderTraversal(TreeNode root) {
        List < Integer > res = new ArrayList<Integer>();
        Stack < TreeNode > stack = new Stack<TreeNode>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }
    public static void main(String[] args) {
        Solution s = new Solution();

        TreeNode secondNode = new TreeNode(2);
        TreeNode thirdNode = new TreeNode(1);
        TreeNode root = new TreeNode(3, secondNode, thirdNode);

        List<Integer> values = s.inorderTraversal(root);
        System.out.print(values);

    }

}
