public class OptimizedDiameter{
    public static void main(String args[]){
        BinaryTree tree = new BinaryTree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(5);
        System.out.println(tree.diameterOptimized(root));
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
        int diameter;
        int height;

        Info(int diameter, int height){
            this.diameter = diameter;
            this.height = height;
        }
    }

    public Info diameterOptimized(Node root){
        if(root==null){
            return new Info(0, 0);
        }
        Info left = diameterOptimized(root.left);
        Info right = diameterOptimized(root.right);
        int totaldiameter = Math.max(Math.max(left.diameter, right.diameter), left.height+right.height+1);
        int totalheight = Math.max(left.height, right.height) + 1;
        return new Info(totaldiameter, totalheight);
    }
}