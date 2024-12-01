public class removeDuplicates{
    public static void removeDuplicates(String str, int i, StringBuilder sb, boolean alphabets[]){
        if(i==str.length()-1){
            System.out.println(sb);
            return;
        }
        if(alphabets[str.charAt(i)-'a']!=true){
            sb.append(str.charAt(i));
            alphabets[str.charAt(i)-'a']=true;
        }
        removeDuplicates(str, i+1, sb, alphabets);
    }
    public static void main(String args[]){
        boolean arr[] = new boolean[26];
        removeDuplicates("appnnacollnege", 0, new StringBuilder(""), arr);
    }
}