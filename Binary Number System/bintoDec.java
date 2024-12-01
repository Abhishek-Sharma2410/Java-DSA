import java.util.*;
public class bintoDec{
    public static int bintoDec(int n){
        int answer=0, power=0, d;
        while(n!=0){
            d=n%10;
            answer+=(d*(int)Math.pow(2, power));
            power++;
            n/=10;
        }
        return answer;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int binary = sc.nextInt();
        System.out.println(bintoDec(binary));
    }
}