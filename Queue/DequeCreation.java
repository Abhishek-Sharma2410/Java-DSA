import java.util.Deque;
import java.util.LinkedList;
public class DequeCreation{
    public static void main(String args[]){
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.addLast(3);
        System.out.println(deque);
        System.out.println(deque.getLast());
    }
}
