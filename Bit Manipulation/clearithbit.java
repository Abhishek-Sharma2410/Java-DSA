public class clearithbit{
    public static int clearIthBit(int number, int place){
        int bitMask = ~(1<<place);
        number = number & bitMask;
        return number;
    }
    public static void main(String args[]){
        System.out.println(clearIthBit(10, 1));
    }
}