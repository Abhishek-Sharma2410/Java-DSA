public class Height{
    public static void main(String args[]){
            //     1
            //    / \
            //   2   3
            //  / \ / \ 
            // 4  5 8  9
            //     \
            //      6
            //       \
            //        7
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);
        root.right.left = new Node(8);
        root.right.right = new Node(9);
        BinaryTree tree = new BinaryTree();
        System.out.println(tree.height(root));
        System.out.println(tree.countNodes(root));
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
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int totalHeight = Math.max(leftHeight, rightHeight) + 1;
        return totalHeight;
    }
    public int countNodes(Node root){
        if(root==null) return 0;
        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);
        return (leftNodes + rightNodes + 1);
    }
    // for counting nodes here is the link for detailed answer
    // https://chatgpt.com/share/67505877-53dc-800e-8787-4c1328d36b22A
}