public class SizeOfLargestBSTinBT{
    public static void main(String args[]){
        //     BST

        //     50
        //    /  \
        //   30   60 
        //  / \   / \
        // 5  20 45  70
        //           / \
        //          65  80
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        BinaryTree tree = new BinaryTree();
        tree.largestBSTinBT(root);
        System.out.println(tree.maxSize);
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
    class Info{
        boolean isBST;
        int max;
        int min;
        int size;

        Info(boolean isBST, int max, int min, int size){
            this.isBST = isBST;
            this.max = max;
            this.min = min;
            this.size = size;
        }
    }
    public int maxSize = 0;
    public Info largestBSTinBT(Node root){
        if(root == null){
            return new Info(true, Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
        }
        Info leftInfo = largestBSTinBT(root.left);
        Info rightInfo = largestBSTinBT(root.right);
        int size = leftInfo.size + rightInfo.size + 1;
        int max = Math.max(Math.max(leftInfo.max, rightInfo.max), root.data);
        int min = Math.min(Math.min(leftInfo.min, rightInfo.min), root.data);

        if(root.data>=rightInfo.min || root.data<=leftInfo.max){
            return new Info(false, max, min, size);
        }
        if(leftInfo.isBST && rightInfo.isBST){
            maxSize = Math.max(size, maxSize);
            return new Info(true, max, min, size);
        }

        return new Info(false, max, min, size);
    }
}