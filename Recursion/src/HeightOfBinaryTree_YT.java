class Node{

    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

}

public class HeightOfBinaryTree_YT {

    public static int height(Node root){

        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1+Math.max(leftHeight,rightHeight);

    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.right = new Node(2);
        root.left = new Node(3);

        root.right.right = new Node(4);
        root.left.left = new Node(5);

        root.right.right.right = new Node(6);
        root.left.left.left = new Node(7);

        int result = height(root);

        System.out.println(result);
    }

}