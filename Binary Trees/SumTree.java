public class SumTree{
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
        tree.SumTree(root);
        System.out.println(root.data);
        System.out.println(root.left.data);
        tree.preOrderTraversal(root);
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
    public void preOrderTraversal(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public int SumTree(Node root){
        if(root==null) return 0;
        int leftSum = SumTree(root.left);
        int rightSum = SumTree(root.right);
        int rootData = root.data;
        root.data = leftSum + rightSum;
        return root.data+rootData;
    }
}