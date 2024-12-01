import java.util.Scanner;
public class sumofevenodd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int sumEven = 0, sumOdd =0;
        for(int i=0; i<range; i++){
            int number = sc.nextInt();
            if(number%2==0){
                sumEven+=number;
            }
            else{
                sumOdd+=number;
            }
        }
        System.out.println(sumEven);
        System.out.println(sumOdd);
    }
}