

public class RangeSum{
    public static void main(String args[]){
        //     BST 

        //     10
        //    /  \
        //   5    15
        //  / \    \
        // 3   7   18 
        Node root = new Node(10);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right = new Node(15);
        root.right.right = new Node(18);
        BinaryTree tree = new BinaryTree();
        System.out.println(tree.RangeSum(root, 7, 15));
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
    public int RangeSum(Node root, int low, int high){
            if(root==null) return 0;
            int ans = 0;
            if(root.data>=low && root.data<=high){
                ans += root.data;
            }
            ans += RangeSum(root.left, low, high);
            ans += RangeSum(root.right, low, high);
            return ans;
    }
}