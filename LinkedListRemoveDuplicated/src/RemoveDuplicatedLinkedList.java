import java.io.*;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d) {
        data=d;
        next=null;
    }

}
class RemoveDuplicatedLinkedList {

    public static Node removeDuplicates(Node head) {
        Node current = head;

        while (current.next != null) {
            boolean isDuplicated = isDuplicated(current, current.next);

            if (isDuplicated) {
                current.next = getNextDifferent(current.next);

                //remove duplicated
                if (current.next != null)
                    current = current.next;
            } else {
                current = current.next;
            }

        }

        return head;
    }

    private static Node getNextDifferent(Node node) {
        int data = node.data;

        while (node.data == data && node.next != null) {
            node = node.next;
        }

        if (node.data == data) {
            return null;
        }

        return node;
    }

    public static boolean isDuplicated(Node current, Node next) {
        return current.data == next.data;
    }

    public static  Node insert(Node head,int data) {
        Node p = new Node(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
    {
        Node start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head = removeDuplicates(head);
        display(head);

    }
}