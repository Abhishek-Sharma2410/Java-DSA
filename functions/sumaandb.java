import java.util.Scanner;
public class sumaandb{
    public static int sum(int a, int b){
        return a+b;
    }
    public static int product(int a, int b){
        return a*b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(product(a, b));
        System.out.println(sum(a,b));
    }
}