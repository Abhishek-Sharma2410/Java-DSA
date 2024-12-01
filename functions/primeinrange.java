import java.util.Scanner;
public class primeinrange{
    public static boolean isPrime(int n){
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for(int i=start; i<=end; i++){
            if(isPrime(i)){
                System.out.print(i+ " ");
            }
        }
    }
}
