import java.util.Scanner;
public class dectoBin{
    public static int dectoBin(int n){
        int power=0, d, binary=0;
        while(n>0){
            d=n%2;
            binary+=(d*(int)Math.pow(10, power));
            power++;
            n/=2;
        }
        return binary;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(dectoBin(number));
    }
}