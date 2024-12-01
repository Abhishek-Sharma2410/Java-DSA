import java.util.Scanner;
public class tcsassign{
    public static boolean isEvenZeros(int number){
        int binaryEquivalent = binaryEquivalent(number);
        int d, count=0;
        while(binaryEquivalent>0){
            d=binaryEquivalent%10;
            if(d==0){
                count++;
            }
            binaryEquivalent/=10;
        }
        boolean result = (count%2==0)? true : false;
        return result;
    }
    public static int binaryEquivalent(int number){
        int binary=0, d, power=1;
        while(number>0){
            d=number%2;
            binary+=(power*d);
            power*=10;
            number/=2;
        }
        return binary;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isEvenZeros(number));
    }
}