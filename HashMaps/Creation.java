import java.util.HashMap;
public class Creation{
    public static void main(String args[]){
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 150);
        hm.put("China", 100);
        hm.put("United States", 90);
        hm.put("India", 120);

        System.out.println(hm);
        System.out.println(hm.get("India"));
        System.out.println(hm.containsKey("Indonesia"));
    }
}