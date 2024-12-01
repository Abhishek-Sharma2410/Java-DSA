import java.util.Scanner;
class question3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float penPrice = sc.nextFloat();
        float pencilPrice = sc.nextFloat();
        float ereaserPrice = sc.nextFloat();
        float pricetoPay = (pencilPrice+penPrice+ereaserPrice) + 0.18f;
        System.out.println(pricetoPay);
    }
}
