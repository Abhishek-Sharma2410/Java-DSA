import java.util.Stack;
public class QueueTwoStacks{
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.printQueue();
        System.out.println(q.isEmpty());
    }
}

class Queue{
    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    public boolean isEmpty(){
        return s1.isEmpty();
    }
    public void add(int data){
        if(s1.isEmpty()){
            s1.push(data);
            return;
        }
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    public int remove(){
        if(s1.isEmpty()){
            System.out.println("Queue is Empty !");
            return -1;
        }
        return s1.pop();
    }
    public int peek(){
        if(s1.isEmpty()){
            System.out.println("Queue is Empty !");
            return -1;
        }
        return s1.peek();
    }
    public void printQueue(){
        while(!s1.isEmpty()){
            System.out.print(s1.pop() + " ");
        }
        System.out.println();
    }
}