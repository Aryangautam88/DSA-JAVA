class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}

public class T_sum_of_tree_Nodes {

    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(41);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);
        Node g = new Node(10);
        Node h = new Node(20);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        e.right = h;
        c.left = g; c.right = f;

        display(a);
        System.out.println();
        System.out.println(sum(a));



    }

    public static void display(Node root){

        if(root == null) return;

        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);

    }

    public static int sum(Node root) {
         int sum = 0;

         if(root == null) return 0;
         sum = root.val+sum(root.left)+sum(root.right);

         return sum;
    }

}
