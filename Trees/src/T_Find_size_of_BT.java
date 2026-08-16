class SNode{
    int val;
    SNode left;
    SNode right;
    SNode(int val){
        this.val = val;
    }
}

public class T_Find_size_of_BT {

    public static void main(String[] args) {

        SNode a = new SNode(1);
        SNode b = new SNode(41);
        SNode c = new SNode(3);
        SNode d = new SNode(2);
        SNode e = new SNode(6);
        SNode f = new SNode(5);
        SNode g = new SNode(10);
        SNode h = new SNode(20);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        e.right = h;
        c.left = g; c.right = f;

        System.out.println(size(a));

    }
    public static int size(SNode root){

        int size = 0;
        if(root == null) return 0;
        return size = 1 + size(root.left) + size(root.right);

    }


}
