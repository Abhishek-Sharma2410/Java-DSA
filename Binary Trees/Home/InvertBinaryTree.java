public class InvertBinaryTree{
    public static void main(String args[]){
        //     1
        //    / \
        //   2   3
        //  / \ / \ 
        // 4   56  7

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        BinaryTree tree = new BinaryTree();
        System.out.println(tree.invertBinaryTree(root).right.data);
        tree.preOrderTraversal(tree.invertBinaryTree(root));
    }
}

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.right = null;
        this.left = null;
    }
}

class BinaryTree{
    public Node invertBinaryTree(Node root){
        if(root==null){
            return null;
        }
        Node newNode = new Node(root.data);
        newNode.left = invertBinaryTree(root.right);
        newNode.right = invertBinaryTree(root.left);
        return newNode;
    }
    public void preOrderTraversal(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
}   