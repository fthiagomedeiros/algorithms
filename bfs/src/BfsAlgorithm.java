import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

class Node{
    Node left, right;
    int data;

    Node(int data) {
        this.data=data;
        left=right=null;
    }
}

class Solution {

    static void levelOrder(Node root){
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        StringBuilder output = new StringBuilder();

        while (!queue.isEmpty()) {
            Node r = queue.poll();
            output.append(visit(r));

            Node left = r.left;
            Node right = r.right;

            if (left != null) {
                queue.add(left);
            }

            if (right != null) {
                queue.add(right);
            }

        }

        System.out.println(output.toString().trim());
    }

    private static String visit(Node r) {
        return r.data + " ";
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}