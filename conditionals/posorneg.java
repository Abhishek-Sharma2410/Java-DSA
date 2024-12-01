import java.util.Scanner;
public class posorneg{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number<0) System.out.println("Number is negative");
        else System.out.println("Number is positive");
    }
}