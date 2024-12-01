// This is the implementation using Arraylists
import java.util.ArrayList;
public class StacksCreation{
    public static void main(String args[]){
        Stack newStack = new Stack();
        newStack.push(4);
        newStack.push(3);
        newStack.push(2);
        newStack.push(1);
        while(!newStack.isEmpty()){
            System.out.print(newStack.peek() + " ");
            newStack.pop();
        }
        System.out.println();
        System.out.println(newStack.isEmpty());
    }
}

class Stack{
    ArrayList<Integer> stack = new ArrayList<>();

    public boolean isEmpty(){
        return (stack.size()==0);
    }
    public void push(int data){
        stack.add(data);
    }
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int poppedElement = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return poppedElement;
    }
    public int peek(){
        if(isEmpty()) return -1;
        int peekElement = stack.get(stack.size()-1);
        return peekElement;
    }
}