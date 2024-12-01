import java.util.Scanner;
public class evenorodd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number%2==0){
            System.out.println("Given number is even");
        }
        else{
            System.out.println("Entered number is odd");
        }
    }
}