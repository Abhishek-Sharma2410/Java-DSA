public class Diameter{
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(5);
        BinaryTree tree = new BinaryTree();
        System.out.println(tree.height(root));
        System.out.println(tree.diameter(root));
    }
}

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

class BinaryTree{
    public int height(Node root){
        if(root==null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }
    public int diameter(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        int leftDiam = diameter(root.left);
        int rightDiam = diameter(root.right);
        int selfDiam = lh + rh + 1;
        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    }
}