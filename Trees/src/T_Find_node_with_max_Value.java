class MNode{
    int val;
    MNode left;
    MNode right;
    MNode(int val){
        this.val = val;
    }
}

public class T_Find_node_with_max_Value {

    public static void main(String[] args) {

        MNode a = new MNode(1);
        MNode b = new MNode(41);
        MNode c = new MNode(3);
        MNode d = new MNode(2);
        MNode e = new MNode(6);
        MNode f = new MNode(5);
        MNode g = new MNode(10);
        MNode h = new MNode(20);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        e.right = h;
        c.left = g; c.right = f;

        System.out.println(max(a));

    }
    public static int max(MNode root){
        int maxi = 0;
        if(root == null)
            return Integer.MIN_VALUE;
        int left = max(root.left);
        int right = max(root.right);

        return  maxi = Math.max(root.val,Math.max(left,right));
    }

}
