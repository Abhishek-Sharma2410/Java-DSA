import java.util.HashMap;
public class ValidAnagrams{
    public static boolean isAnagram(String s, String t){
        HashMap<Character, Integer> hm = new HashMap<>();
        s = s.toLowerCase();
        t = t.toLowerCase();
        for(int i=0; i<s.length(); i++){
            char letter = s.charAt(i);
            hm.put(letter, hm.getOrDefault(letter, 0)+1);
        }
        for(int i=0; i<t.length(); i++){
            char letter = t.charAt(i);
            if(hm.containsKey(letter)){
                hm.put(letter, hm.get(letter)-1);
                if(hm.get(letter)==0){
                    hm.remove(letter);
                }
            }
            else{
                return false;
            }
        }
        return hm.isEmpty();
    }
    public static void main(String args[]){
        String s = "anna";
        String t = "aann";
        System.out.println(isAnagram(s, t));
    }
}