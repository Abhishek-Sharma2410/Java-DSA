import java.util.Scanner;
public class question3{
    public static boolean isPalindrome(int number){
        int temp = number;
        int d, sum=0;
        while(number!=0){
            d=number%10;
            sum=sum*10+d;
            number/=10;
        }
        if(sum==temp){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println(isPalindrome(num1));
    }
}