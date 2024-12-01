public class printdecreasing{
    public static void printNumbers(int number){
        System.out.print(number+ " ");
        if(number>1)
        printNumbers(number-1);
    }
    public static void main(String args[]){
        printNumbers(10);
    }
}