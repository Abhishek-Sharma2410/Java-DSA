public class Palindrome{
    public static void main(String args[]){
        LinkedList newList = new LinkedList();
        newList.addFirst(1);
        newList.addFirst(2);
        newList.addFirst(2);
        newList.addFirst(3);
        newList.addFirst(1);
        newList.printList();
        System.out.println(newList.isPalindrome());
    }
}

class LinkedList{
    private class Node{
        int data;
        Node next;

        private Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    private Node tail;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public Node findMiddle(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(){
        // Base Case
        if(head==null && head.next==null) return true;
        // Finding Middle
        Node middle = findMiddle();
        // Reversing the right part after middle
        Node previous = null;
        Node current = middle;
        Node next;
        while(current!=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        // Declaring the right and left pointer for checking the palindrome
        Node right = previous;
        Node left = head;
        while(right!=null){
            if(right.data != left.data){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }
    public void printList(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}