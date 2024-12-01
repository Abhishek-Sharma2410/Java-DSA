import java.util.Scanner;
public class primeOptimal{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int flag=0;
        for(int i=2; i*i<=number; i++){
            if(number%i==0){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Number is not prime");
        }
        else{
            System.out.println("Number is prime");
        }
    }
}