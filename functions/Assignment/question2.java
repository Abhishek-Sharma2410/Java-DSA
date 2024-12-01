import java.util.Scanner;
public class question2{
    public static boolean isEven(int number){
        if(number%2==0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println(isEven(num1));
    }
}