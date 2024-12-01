public class sumton{
    public static int sumOneToN(int number){
        if(number==1){
            return 1;
        }
        else {
            return number + sumOneToN(number-1);
        }
    }
    public static void main(String args[]){
        System.out.println(sumOneToN(11));
    }
}