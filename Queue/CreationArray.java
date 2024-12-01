public class CreationArray{
    public static void main(String args[]){
        Queue q = new Queue(4);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.printQueue();
    }
}

class Queue{
    private int arr[];
    public int size;
    public int rear = -1;
    private int front = -1;

    public Queue(int n){
        arr = new int[n];
        size = n;
    }

    public boolean isEmpty(){
        return rear==-1;
    }
    public void add(int data){
        if(rear == size-1){
            System.out.println("Queue is Full");
            return;
        }
        if(front == -1) front = arr[0];
        rear = rear + 1;
        arr[rear] = data;
    }
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int removedElement = arr[0];
        for(int i=0; i<rear; i++){
            arr[i] = arr[i+1];
        }
        rear = rear - 1;
        return removedElement;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int peekedElement = arr[0];
        return peekedElement;
    }
    public void printQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty !");
            return;
        }
        while(!isEmpty()){
            System.out.print(peek() +" ");
            remove();
        }
    }
}