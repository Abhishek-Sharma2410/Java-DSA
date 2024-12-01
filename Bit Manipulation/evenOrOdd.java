public class evenOrOdd{
    public static String isEvenOdd(int number){
        String answer = ((number&1)==0)?"Even":"Odd";
        return answer; 
    }
    public static void main(String args[]){
        System.out.println(isEvenOdd(5));
        System.out.println(isEvenOdd(10));
        System.out.println(isEvenOdd(15));
        System.out.println(isEvenOdd(20));
    }
}