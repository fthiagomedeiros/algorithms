import java.util.List;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class BinaryTree {

    private TreeNode root;

    public void insert(int data) {

        TreeNode node = new TreeNode();
        node.setVal(data);
        if (root == null) {
            root = node;
            return;
        }

        TreeNode previous = null;
        TreeNode temp = root;
        while (temp != null) {

            previous = temp;
            if (data < temp.getVal()) {
                temp = temp.getLeft();
            } else if (data > temp.getVal()) {
                temp = temp.getRight();
            }

        }

        if (data < previous.getVal()) {

            previous.setLeft(node);
        } else {
            previous.setRight(node);
        }
    }

    public void insert(List<Integer> data) {
        data.stream()
            .peek(this::insert)
            .collect(Collectors.toList());
    }

    public boolean hasData(int data) {
        if (root == null) {
            return false;
        }

        TreeNode temp = root;
        while (true) {
            if (data < temp.getVal()) {
                temp = temp.getLeft();

            } else if (data > temp.getVal()) {
                temp = temp.getRight();
            }

            if (temp == null) {
                return false;
            }

            if (temp.getVal() == data) {
                return true;
            }
        }

    }

}
