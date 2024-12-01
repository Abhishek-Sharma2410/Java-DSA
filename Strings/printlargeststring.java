public class printlargeststring{
    public static String printLargestString(String fruits[]){
        String largestString=fruits[0];
        for(int i=0; i<fruits.length-1; i++){
            if((fruits[i].compareToIgnoreCase(fruits[i+1]))<0){
                largestString=fruits[i+1];
            }
            else if((fruits[i].compareToIgnoreCase(fruits[i+1]))>0){
                largestString=fruits[i];
            }
        }
        return largestString;
    }
    public static void main(String args[]){
        String fruits[] = {"apple", "mango", "banana", "orange"};
        System.out.println(printLargestString(fruits));
    }
}