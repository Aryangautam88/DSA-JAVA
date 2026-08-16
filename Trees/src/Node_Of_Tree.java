class TNode{
    int val;
    TNode left;
    TNode right;
    TNode(int val){

        this.val = val;
    }
}
public class Node_Of_Tree {

    public static void main(String[] args) {

        TNode a = new TNode(1);
        TNode b = new TNode(4);
        TNode c = new TNode(3);
        TNode d = new TNode(2);
        TNode e = new TNode(6);
        TNode f = new TNode(5);

        a.left = b; a.right = c;
        b.left = d ;b.right = e;
        c.right=f;

        display(a);


    }

    public static void display(TNode root){

        if(root == null) return;

        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }

}
