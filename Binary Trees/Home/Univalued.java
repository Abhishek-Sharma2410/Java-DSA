public class Univalued{
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(1);
        root.left.left = new Node(1);
        root.left.right = new Node(1);
        root.right = new Node(1);
        root.right.left = new Node(1);
        root.right.right = new Node(1);
        BinaryTree tree = new BinaryTree();
        System.out.println(tree.isUnivalued(root));
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
    public boolean isUnivalued(Node root){
        if(root==null){
            return true;
        }
        if(root.left!=null && root.left.data!=root.data){
            return false;
        }
        if(root.right!=null && root.right.data!=root.data){
            return false;
        }
        boolean left = isUnivalued(root.left);
        boolean right = isUnivalued(root.right);
        return left && right;
    }
}