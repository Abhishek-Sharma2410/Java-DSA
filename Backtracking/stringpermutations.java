public class stringpermutations{
    public static void printSubstrings(String str, String ans, int i){
        if(i==str.length()){
            System.out.print(ans+" ");
            return;
        }
        printSubstrings(str, ans+str.charAt(0), i+1);
        printSubstrings(str, ans+str.charAt(1), i+1);
        printSubstrings(str, ans+str.charAt(2), i+1);
    }
    public static void main(String args[]){
        String str = "abc";
        String ans = "";
        printSubstrings(str, ans, 0);
    }
}