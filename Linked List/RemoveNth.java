public class RemoveNth{
    public static void main(String args[]){
        LinkedList newList = new LinkedList();
        newList.addFirst(5);
        newList.addFirst(4);
        newList.addFirst(3);
        newList.addFirst(2);
        newList.addFirst(1);
        newList.printList();
        newList.reverseList();
        newList.printList();
        newList.removeNthElement(2);
        newList.printList();
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
    public void removeNthElement(int n){
        if(n==0){
            head = head.next;
            return;
        }
        Node temp = head;
        int i=0;
        while(i<n-1){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
    }
    public void reverseList(){
        Node previous = null;
        Node current = head;
        Node next;
        while(current!=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
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