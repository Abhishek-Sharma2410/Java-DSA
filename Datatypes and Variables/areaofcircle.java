import java.util.Scanner;
public class areaofcircle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextFloat();
        double area = (3.14*r*r);
        System.out.println(area);
    }
}