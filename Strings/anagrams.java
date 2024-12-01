import java.util.Arrays;
public class anagrams{
    public static boolean isAnagram(String str, String str2){
        if(str.length()!=str2.length()) return false;
        char s1[] = str.toCharArray();
        char s2[] = str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(s1.equals(s2)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        String str = "abba";
        String str2 = "aabb";
        System.out.println(isAnagram(str, str2));
    }
}