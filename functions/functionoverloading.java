import java.util.Scanner;
public class functionoverloading{
    public static int multiply(int a, int b){
        return a*b;
    }
    public static float multiply(float a, float b){
        return a*b;
    }
    public static int multiply(int a, int b, int c){
        return (a*b*c);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println(multiply(a,b));
    }
}