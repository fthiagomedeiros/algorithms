public class BinaryTree {

    private TreeNode root;

    public void insert(int data) {
        if (root == null) {
            root = new TreeNode(data);
            return;
        }

        TreeNode previous = null;
        TreeNode temp = root;
        while (temp != null) {

            previous = temp;
            if (data < temp.data) {
                temp = temp.left;
            } else if (data > temp.data) {
                temp = temp.right;
            }

        }

        if (data < previous.data) {
            previous.left = new TreeNode(data);
        } else {
            previous.right = new TreeNode(data);
        }
    }

    public boolean hasData(int data) {
        if (root == null) {
            return false;
        }

        TreeNode temp = root;
        while (true) {
            if (data < temp.data) {
                temp = temp.left;

            } else if (data > temp.data) {
                temp = temp.right;
            }

            if (temp == null) {
                return false;
            }

            if (temp.data == data) {
                return true;
            }
        }

    }
}
