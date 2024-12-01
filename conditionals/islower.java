import java.util.Scanner;
public class islower{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char letter = sc.next().charAt(0);
        if(letter>=97 && letter<=122){
            System.out.println("Entered letter is in Lower case");
        }
        else{
            System.out.println("Entered letter is in Upper Case");
        }
    }
}