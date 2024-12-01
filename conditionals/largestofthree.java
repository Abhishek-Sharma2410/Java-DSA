//This is the program of finding the greatest number among three using ternary operator

import java.util.Scanner;
public class largestofthree{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans = ((a>b)&&(a>c))?a:((b>c)?b:c);
        System.out.println(ans);
    }
}