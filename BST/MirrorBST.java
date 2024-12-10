public class MirrorBST{
    public static void main(String args[]){
            //    BST 

            //     8
            //    / \
            //   5   10
            //  / \    \
            // 3   6    11
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(10);
        root.right.right = new Node(11);
        BinaryTree tree = new BinaryTree();   
        tree.preOrderTraversal(tree.mirrorBST(root));
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
    public Node mirrorBST(Node root){
        if(root==null) return null;
        Node leftSubtree = mirrorBST(root.left);
        Node rightSubtree = mirrorBST(root.right);
        root.left = rightSubtree;
        root.right = leftSubtree;
        return root;
    }
    public void preOrderTraversal(Node root){
        if(root==null) return;
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right); 
    }
}