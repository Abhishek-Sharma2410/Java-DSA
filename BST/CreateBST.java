public class CreateBST{
    public static void main(String args[]){
        int nodes[] = {3, 5, 6, 8, 10, 11, 12};
        BinaryTree tree = new BinaryTree();
        tree.inOrderTraversal(tree.buildBinaryTree(nodes, 0, nodes.length-1));
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
    public Node buildBinaryTree(int nodes[], int start, int end){
        if(start>end){
            return null;
        }
        int mid = start + (end-start)/2;
        Node root = new Node(nodes[mid]);
        root.left = buildBinaryTree(nodes, start, mid-1);
        root.right = buildBinaryTree(nodes, mid+1, end);
        return root;
    }
    public void inOrderTraversal(Node root){
        if(root==null) return;
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }
}