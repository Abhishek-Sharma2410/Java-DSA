

public class MergeSort{
    public static void main(String args[]){
        LinkedList List = new LinkedList();
        List.addFirst(1);
        List.addFirst(2);
        List.addFirst(3);
        List.addFirst(4);
        List.addFirst(5);
        List.printList();

        List.head = List.mergeSort(List.head);
        List.printList();
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
    public Node head;
    public Node tail;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public Node mergeSort(Node head){
        if(head.next == null|| head==null){
            return head;
        }
        Node middle = findMiddle(head);
        Node rightHead = middle.next;
        middle.next = null;
        Node leftList = mergeSort(head);
        Node rightList = mergeSort(rightHead);
        return merge(leftList, rightList);
    }
    public Node merge(Node left, Node right){
        Node newNode = new Node(-1);
        Node current = newNode;
        while(left!=null && right!=null){
            if(left.data < right.data){
                current.next = left;
                left = left.next;
                current = current.next;
            }
            else if(right.data < left.data){
                current.next = right;
                right = right.next;
                current = current.next;
            }
        }
        while(left!=null){
            current.next = left;
            left = left.next;
            current = current.next;
        }
        while(right!=null){
            current.next = right;
            right = right.next;
            current = current.next;
        }
        return newNode.next;
    }
    public Node findMiddle(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public void printList(){
        if(head == null){
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}