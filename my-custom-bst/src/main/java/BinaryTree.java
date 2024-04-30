import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BinaryTree {

    private TreeNode root;

    public void insert(int data) {

        TreeNode node = new TreeNode();
        node.setData(data);
        if (root == null) {
            root = node;
            return;
        }

        TreeNode previous = null;
        TreeNode temp = root;
        while (temp != null) {

            previous = temp;
            if (data < temp.getData()) {
                temp = temp.getLeft();
            } else if (data > temp.getData()) {
                temp = temp.getRight();
            }

        }

        if (data < previous.getData()) {

            previous.setLeft(node);
        } else {
            previous.setRight(node);
        }
    }

    public boolean hasData(int data) {
        if (root == null) {
            return false;
        }

        TreeNode temp = root;
        while (true) {
            if (data < temp.getData()) {
                temp = temp.getLeft();

            } else if (data > temp.getData()) {
                temp = temp.getRight();
            }

            if (temp == null) {
                return false;
            }

            if (temp.getData() == data) {
                return true;
            }
        }

    }
}
