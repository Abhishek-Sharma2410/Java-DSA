import java.util.Scanner;
public class factorial{
    public static long factorial(int number){
        long fact=1;
        while(number!=0){
            fact*=number;
            number--;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}