import java.util.Scanner;
public class question1{
    public static float averageofThree(int a, int b, int c){
        return ((a+b+c)/3);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println(averageofThree(num1, num2, num3));
    }
}