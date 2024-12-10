import java.util.LinkedList;
import java.util.Queue;
public class StreamFirstNonRepeating{
    public static void streamNonRepeating(String str){
        StringBuilder sb = new StringBuilder("");
        Queue<Character> q = new LinkedList<>();
        int frequency[] = new int[26];
        for(int i=0; i<str.length(); i++){
            char letter = str.charAt(i);
            letter = Character.toLowerCase(letter);
            q.add(letter);
            frequency[letter - 'a']++;
            while(!q.isEmpty() && frequency[q.peek()-'a']>1){
                q.remove();
            }
            if(!q.isEmpty()){
                sb.append(q.peek());
            }
            else{
                sb.append("-1");
            }
        }
        System.out.println(sb);
    }
    public static void main(String args[]){
        String str = "aabccxb";
        streamNonRepeating(str);
    }
}