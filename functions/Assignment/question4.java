import java.util.Scanner;
public class question4{
    public static int sumOfNumber(int number){
       int d, sum=0;
       while(number>0){
            d=number%10;
            sum+=d;
            number/=10;
       }
       return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println(sumOfNumber(num1));
    }
}