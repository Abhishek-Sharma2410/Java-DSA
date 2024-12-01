public class setithbit{
    public static int setIthBit(int number, int place){
        int bitMask = 1<<place;
        return number|bitMask;
    }
    public static void main(String args[]){
        System.out.println(setIthBit(10, 2));
    }
}