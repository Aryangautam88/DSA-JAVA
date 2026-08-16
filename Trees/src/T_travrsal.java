class TraversalNode{
    int val;
    TraversalNode left;
    TraversalNode right;
    TraversalNode(int val){
        this.val = val;
    }
}


public class T_travrsal {

    public static void main(String[] args) {


        TraversalNode a = new TraversalNode(1);
        TraversalNode b = new TraversalNode(2);
        TraversalNode c = new TraversalNode(3);
        TraversalNode d = new TraversalNode(4);
        TraversalNode e = new TraversalNode(5);
        TraversalNode f = new TraversalNode(6);
        TraversalNode g = new TraversalNode(7);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = g; c.right = f;

        System.out.print("PreOrder: ");
        preOrder(a);
        System.out.println();
        System.out.print("InOrder: ");
        inOrder(a);
        System.out.println();
        System.out.print("PostOrder: ");
        postOrder(a);

    }
    public static void preOrder(TraversalNode root){

        if(root == null) return;

        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);

    }
    public static void inOrder(TraversalNode root){

        if(root == null) return;

        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);

    }
    public static void postOrder(TraversalNode root){

        if(root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");

    }

}
