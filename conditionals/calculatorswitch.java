import java.util.Scanner;
public class calculatorswitch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int result=0;
        int opr1 = sc.nextInt();
        int opr2 = sc.nextInt();
        System.out.println("Choose Something to perform on operands\n"+"1. Addition\n"+"2. Subtraction\n"+"3. Multiplication\n");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                result=opr1+opr2;
                break;
            case 2:
                result=opr1-opr2;
                break;
            case 3:
                result=opr1*opr2;
                break;
            default:
                System.out.println("Invalid Choice");
        }
        System.out.println("The result of your choice is "+result);
    }
}