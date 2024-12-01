public class LinkedList{
    public static void main(String args[]){
        LL newll = new LL();
        newll.addFirst(1);
        newll.addFirst(2);
        newll.addFirst(3);
        newll.addMiddle(2, 10);
        newll.addFirst(4);
        newll.addFirst(5);
        // newll.printList();
        // System.out.println(newll.size);

        LL ll2 = new LL();
        ll2.addFirst(10);
        ll2.addFirst(9);
        ll2.addFirst(8);
        ll2.addFirst(7);
        ll2.addFirst(6);
        ll2.addLast(20);
        ll2.printList();
        System.out.println(ll2.size);
        ll2.deleteLast();
        ll2.printList();
        System.out.println(ll2.size);
    }
}

class LL{
    private class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    public int size;

    public void addFirst(int data){
        Node nn = new Node(data);
        size++;
        if(head==null){
            head = tail = nn;
            return;
        }
        nn.next = head;
        head = nn;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(tail==null){
            head = tail = newNode;  
            return;
        } 
        tail.next = newNode;
        tail = newNode; 
    }
    public void addMiddle(int index, int data){
        if(head==null){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void deleteFirst(){
        if(size==0){
            System.out.println("Linked List is empty");
            return;
        }
        else if(size==1){
            head = tail = null;
            size--;
        }
        head = head.next;
        size--;
    }
    public void deleteLast(){
        if(size==0){
            System.out.println("Linked List is empty");
        }
        else if(size==1){
            head = tail = null;
            size--;
        }
        int i = 0;
        Node temp = head;
        while(i<size-2){
            temp = temp.next;
            i++;
        }
        tail = temp;
        temp.next = null;
        size--;
    }
    public void printList() {
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}