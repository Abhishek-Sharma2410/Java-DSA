import java.util.Scanner;
public class factorial{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        long fact=1;
        while(number>0){
            fact*=number;
            number--;
        }
        System.out.println(fact);
    }
}