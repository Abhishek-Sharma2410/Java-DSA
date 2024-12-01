public class clearlastibits{
    public static int clearLastIBits(int number, int place){
        int bitMask = ~(0)<<place;
        return number&bitMask;
    }
    public static void main(String args[]){
        int number = 15;
        int place = 2;
        System.out.println(clearLastIBits(number, place));
    }
}