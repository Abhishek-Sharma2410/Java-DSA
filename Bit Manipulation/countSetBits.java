public class countSetBits{
    public static int countSetBits(int number){
        int count = 0;
        while(number>0){
            int d = number%2;
            if(d!=0) count++;
            number/=2;
        }
        return count;
    }
    public static void main(String args[]){
        int number = 10;
        System.out.println(countSetBits(number));
    }
}