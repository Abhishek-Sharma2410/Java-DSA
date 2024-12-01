import java.util.ArrayList;
import java.util.Collections;
public class Sortlist{
    public static void main(String args[]){
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(4);
        lst.add(8);
        Collections.sort(lst);
        System.out.println(lst);
    }
}