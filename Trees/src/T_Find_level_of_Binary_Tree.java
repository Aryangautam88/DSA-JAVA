class LevelNode{
    int val;
    LevelNode left;
    LevelNode right;
    LevelNode(int val){
        this.val = val;
    }
}


public class T_Find_level_of_Binary_Tree {

    public static void main(String[] args) {

        LevelNode a = new LevelNode(1);
        LevelNode b = new LevelNode(41);
        LevelNode c = new LevelNode(3);
        LevelNode d = new LevelNode(2);
        LevelNode e = new LevelNode(6);
        LevelNode f = new LevelNode(5);
        LevelNode g = new LevelNode(10);
        LevelNode h = new LevelNode(20);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        e.right = h;
        c.left = g; c.right = f;

        System.out.println(level(a));
        System.out.println(height(a));

    }

    public static int level(LevelNode root){
        if(root == null) return 0;

        int level = 1+Math.max(level(root.left),level(root.right));

        return level;
    }
    public static int height(LevelNode root) {

        if (root == null)
            return -1;

        return 1 + Math.max(height(root.left), height(root.right));
    }


}
