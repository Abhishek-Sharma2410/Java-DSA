import java.util.Scanner;
public class palindrome{
    public static boolean checkPalindrome(String str){
        int start=0, end=str.length()-1;
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
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(checkPalindrome(str));
    }
}