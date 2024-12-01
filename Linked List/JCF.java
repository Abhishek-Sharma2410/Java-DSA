import java.util.LinkedList;
public class JCF{
    public static void main(String args[]){
        LinkedList<Integer> newList = new LinkedList<>();
        newList.addFirst(5);
        newList.addFirst(4);
        newList.addFirst(3);
        newList.addFirst(2);
        newList.addFirst(1);
        System.out.println(newList);
        Integer head = newList.getFirst();
        System.out.println(head);
        Integer tail = newList.getLast();
        System.out.println(tail);
    }
}