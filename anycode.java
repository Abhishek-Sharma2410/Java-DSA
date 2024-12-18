public class anycode{
    public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        int start = 0, end = str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String args[]){
        String str = "Racecar";
        System.out.println(isPalindrome(str));
    }
}