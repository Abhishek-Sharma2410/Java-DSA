public class question3{
    public static void lengthString(String str, int i, int count){
        if(i==str.length()){
            System.out.println(count);
            return;
        }
        count++;
        lengthString(str, i+1, count);
    }
    public static void main(String args[]){
        int count = 0;
        lengthString("Hello world", 0, count);
    }
}