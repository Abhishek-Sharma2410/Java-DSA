public class RemoveCycle{
    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.printList();
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
    public boolean detectCycle(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    public void removeCycle(){
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                isCycle = true;
                break;
            }
        }
        if(!isCycle) return;
        slow = head;
        Node previous = null;
        while(fast!=slow){
            previous = fast;
            slow = slow.next;
            fast = fast.next;
        }
        previous.next = null;
    }
    public void printList(){
        if(head==null){
            System.out.println("Linked List is Empty");
            return;
        }
        if(detectCycle()){
            removeCycle();
            printList();
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}   