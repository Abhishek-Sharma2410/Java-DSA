import java.util.Scanner;
public class binomialcofficient{
    public static double binomialCofficient(int n, int r){
        double result = factorial(n)/(factorial(r)*factorial(n-r));
        return result;
    }
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
        int r = sc.nextInt();
        System.out.println(binomialCofficient(n, r));
    }
}