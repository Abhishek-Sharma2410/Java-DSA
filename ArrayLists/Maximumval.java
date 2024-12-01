import java.util.ArrayList;
import java.util.Collections;
public class Maximumval{
    public static void findMaximum(ArrayList<Integer> lst){
        int max = Collections.max(lst);
        System.out.println(max);
    }
    public static void manualMaximumValue(ArrayList<Integer> lst){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<lst.size(); i++){
            max = Math.max(max, lst.get(i));
        }
        System.out.println(max);
    }
    public static void main(String args[]){
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(2);
        lst.add(40);
        lst.add(3);
        lst.add(10);
        lst.add(1);
        findMaximum(lst);
        manualMaximumValue(lst);
    }
}