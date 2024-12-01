import java.util.Scanner;
class incometax{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float salary = sc.nextFloat();
        float incomeTax=0;
        if(salary<500000){
            incomeTax=0;
        }
        else if(salary<=500000 && salary>=1000000){
            incomeTax = salary*0.20f;
        }
        else if(salary>1000000){
            incomeTax=salary*0.30f;
        }
        else{
            System.out.println("Invalid Income");
        }
        System.out.println(incomeTax);
    }
}