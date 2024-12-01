import java.util.Scanner;
class question1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();
        float avg = (A+B+C)/3;
        System.out.println(avg);
    }
}