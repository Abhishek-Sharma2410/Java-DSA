import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class LinkedHashMaps{
    public static void main(String args[]){
        LinkedHashMap<String , Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 150);
        lhm.put("China", 100);
        lhm.put("United States", 150);
        System.out.println(lhm);

        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("India", 150);
        hm.put("China", 100);
        hm.put("United States", 150);
        System.out.println(hm);

        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 150);
        tm.put("China", 100);
        tm.put("United States", 150);
        System.out.println(tm);
    }
}