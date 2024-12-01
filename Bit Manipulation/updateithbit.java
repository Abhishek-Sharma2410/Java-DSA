public class updateithbit{
    public static int setIthBit(int number, int place){
        int bitMask = 1<<place;
        number = number | bitMask;
        return number;
    }
    public static int clearIthBit(int number, int place){
        int bitMask = ~(1<<place);
        return number & bitMask;
    }
    // If the number we want to update is 1 then we will set the value and if the value is 0 then we will clear the value because if we clear the value it will result in 0 and if we set value then it will be one
    public static int updateIthBit(int number, int place, int value){
        if(value==1){
            return setIthBit(number, place);
        }
        else{
            return clearIthBit(number, place);
        }
    }
    public static void main(String args[]){
        // In the below call we have to update in 10's 2nd bit by 1
        System.out.println(updateIthBit(10, 1, 0));
    }
}