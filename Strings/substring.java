public class substring{
    public static String printSubstring(String str, int start, int end){
        String substring = "";
        for(int i=start; i<end; i++){
            substring+=str.charAt(i);
        }
        return substring;
    }
    public static void main(String args[]){
        int si=0, ei=4;
        String str = "HelloWorld";
        System.out.println(str.substring(si,ei));
        System.out.println(printSubstring(str, si, ei));
    }
}