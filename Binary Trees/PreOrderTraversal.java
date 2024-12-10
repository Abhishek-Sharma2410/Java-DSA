public class PreOrderTraversal{
    public static void main(String args[]){
        int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildPreOrder(node);
        tree.preOrderTraversal(root);
        System.out.println();
        tree.inOrderTraversal(root);
        System.out.println();
        tree.postOrder(root);
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
    int idx = -1;
    public Node buildPreOrder(int node[]){
        idx++;
        if(node[idx]==-1){
            return null;
        }
        Node newNode = new Node(node[idx]);
        newNode.left = buildPreOrder(node);
        newNode.right = buildPreOrder(node);
        return newNode;
    }

    // Pre   Order Root Node -> Left Subtree -> Right SubTree
    public void preOrderTraversal(Node root){
        if(root == null){
            System.out.print("-1"+ " ");
            return;
        }
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    // InOrder Left Subtree -> Root Node -> Right Subtree
    public void inOrderTraversal(Node root){
        if(root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    // Post Order Left Subtree -> Right Subtree -> Root
    public void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
}