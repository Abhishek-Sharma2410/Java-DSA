public class getithbit{
    public static int getIthBit(int number, int place){
        int bitMask = 1<<place;
        if((number&bitMask)==0) return 0;
        else return 1;
    }
    public static void main(String args[]){
        System.out.println(getIthBit(5, 4));
    }
}