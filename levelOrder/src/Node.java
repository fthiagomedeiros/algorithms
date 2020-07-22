import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

    //BFS --> Runtime O(n)
	public static void levelOrder(Node root) {
      Queue<Node> queue = new ArrayDeque<>();
      queue.add(root);
      StringBuilder s = new StringBuilder();

      while (!queue.isEmpty()) {
          Node r = queue.poll();
          s = visit(s, r);

          if (r.left != null) {
              queue.add(r.left);
          }

          if (r.right != null) {
              queue.add(r.right);
          }
      }

      System.out.print(s.toString().trim());
    }

    private static StringBuilder visit(StringBuilder s, Node r) {
	    return s.append(r.data).append(" ");
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        levelOrder(root);
    }	
}