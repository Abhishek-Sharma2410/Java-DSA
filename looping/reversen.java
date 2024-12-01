import java.util.Scanner;
public class reversen{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int d,sum=0;
        while(number!=0){
            d=number%10;
            sum=sum*10+d;
            number/=10;
        }
        System.out.println(sum);
    }
}