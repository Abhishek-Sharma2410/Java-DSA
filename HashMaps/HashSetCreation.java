import java.util.HashSet;
import java.util.Iterator;
public class HashSetCreation{
    public static void main(String args[]){
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(4);
        hs.add(1);
        hs.add(2);

        Iterator i = hs.iterator();
        while(i.hasNext()){
            System.out.print(i.next() + " ");
        }

        for(Integer o: hs){
            System.out.print(o+ " ");
        }
    }
}